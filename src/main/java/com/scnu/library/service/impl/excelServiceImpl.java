package com.scnu.library.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.scnu.library.listener.ExcelReadListener;
import com.scnu.library.listener.ExcelSaver;
import com.scnu.library.model.excelMode.bookExcelModel;
import com.scnu.library.model.excelMode.fundProjectExcelModel;
import com.scnu.library.model.excelMode.patentExcelModel;
import com.scnu.library.model.requestModel.*;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.model.responseModel.getFundProjectRes;
import com.scnu.library.model.responseModel.getPatentRes;
import com.scnu.library.service.bookDesService;
import com.scnu.library.service.excelService;
import com.scnu.library.service.fundProjectService;
import com.scnu.library.service.patentService;
import com.scnu.library.tools.enums.commonEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author JabinGP
 * @Date 2019-11-26 10:10
 */

@Repository
@Slf4j
public class excelServiceImpl implements excelService {
    @Value("${spring.fileupload.location}")
    private String location;
    @Value("${spring.fileupload.host}")
    private String host;
    @Autowired
    private bookDesService bookDesService;
    @Autowired
    private fundProjectService fundProjectService;
    @Autowired
    private patentService patentService;

    public void importExcel(String fileName) throws Exception{
        // 读取excel并存储到数据库
        ExcelReader excelReader = EasyExcel.read(fileName, bookExcelModel.class, new ExcelReadListener<bookExcelModel>(
                new ExcelSaver<bookExcelModel>() {
                    @Override
                    public boolean save(bookExcelModel model) {
                        alterBookDesReq req= new  alterBookDesReq();
                        BeanUtils.copyProperties(model,req);
                        req.setId(0);
                        return bookDesService.addBookDes(req);
                }
        })).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);

        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }

    @Override
    public String exportExcel(exportExcelReq req) throws Exception {
        // 根据关键字读取对应数据
        getBookDesReq model = new getBookDesReq();
        BeanUtils.copyProperties(req, model);
        Map<String, Object> resMap = bookDesService.getBookDes(model);
        List<getBookDesRes> list = (List<getBookDesRes>) resMap.get(commonEnum.RESULT_MAP_LIST);

        // 模型转换
        List<bookExcelModel> excelList = new ArrayList<>();
        for(getBookDesRes x : list){
            bookExcelModel excelData = new bookExcelModel();
            BeanUtils.copyProperties(x, excelData);
            excelList.add(excelData);
        }

        // 写入文件
        String fileName = req.getTitle()+"+"+req.getAuthor()+"+"+new Date().getTime()+".xls";

        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = EasyExcel.write(location+"/"+fileName, bookExcelModel.class).build();
        WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
        excelWriter.write(excelList, writeSheet);

        // 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();

        // 返回下载链接
        String url = host+"/"+fileName;

        return url;
    }

    @Override
    public void addFundProjectExcel(String fileName) {
        // 读取excel并存储到数据库
        ExcelReader excelReader = EasyExcel.read(fileName, fundProjectExcelModel.class, new ExcelReadListener<fundProjectExcelModel>(
                new ExcelSaver<fundProjectExcelModel>() {
                    @Override
                    public boolean save(fundProjectExcelModel model) {
                        alterFundProjectReq req= new  alterFundProjectReq();
                        BeanUtils.copyProperties(model,req);
                        return fundProjectService.addFundProject(req);
                    }
                })).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);

        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }

    @Override
    public String getFundProjectExcel(getFundProjectReq requestModel) {
        try {
            // 获取需要生成Excel的数据
            Map<String, Object> resMap = fundProjectService.getFundProject(requestModel);
            List<getFundProjectRes> list = (List<getFundProjectRes>) resMap.get(commonEnum.RESULT_MAP_LIST);

            // excel数据列表
            List<fundProjectExcelModel> excelList = new ArrayList<>();

            // 模型转换
            for(getFundProjectRes x:list){
                fundProjectExcelModel excelData = new fundProjectExcelModel();
                BeanUtils.copyProperties(x,excelData);
                excelList.add(excelData);
            }

            // 写入文件
            String fileName = new Date().getTime()+".xls";

            // 这里需要制定用哪个class去写
            ExcelWriter excelWriter = EasyExcel.write(location+"/"+fileName, fundProjectExcelModel.class).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
            excelWriter.write(excelList, writeSheet);

            // 千万别忘记finish 会帮忙关闭流
            excelWriter.finish();

            // 返回下载链接
            String url = host+"/"+fileName;
            return url;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public void addPatentExcel(String fileName) {
        // 读取excel并存储到数据库
        ExcelReader excelReader = EasyExcel.read(fileName, patentExcelModel.class, new ExcelReadListener<patentExcelModel>(
                new ExcelSaver<patentExcelModel>() {
                    @Override
                    public boolean save(patentExcelModel model) {
                        alterPatentReq req= new  alterPatentReq();
                        BeanUtils.copyProperties(model,req);
                        return patentService.addPatent(req);
                    }
                })).build();
        ReadSheet readSheet = EasyExcel.readSheet(0).build();
        excelReader.read(readSheet);

        // 这里千万别忘记关闭，读的时候会创建临时文件，到时磁盘会崩的
        excelReader.finish();
    }

    @Override
    public String getPatentExcel(getPatentReq requestModel) {
        try {
            // 获取需要生成Excel的数据
            Map<String, Object> resMap = patentService.getPatent(requestModel);
            List<getPatentRes> list = (List<getPatentRes>) resMap.get(commonEnum.RESULT_MAP_LIST);

            // excel数据列表
            List<patentExcelModel> excelList = new ArrayList<>();

            // 模型转换
            for(getPatentRes x:list){
                patentExcelModel excelData = new patentExcelModel();
                BeanUtils.copyProperties(x,excelData);
                excelList.add(excelData);
            }

            // 写入文件
            String fileName = new Date().getTime()+".xls";

            // 这里需要制定用哪个class去写
            ExcelWriter excelWriter = EasyExcel.write(location+"/"+fileName, patentExcelModel.class).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("Sheet1").build();
            excelWriter.write(excelList, writeSheet);

            // 千万别忘记finish 会帮忙关闭流
            excelWriter.finish();

            // 返回下载链接
            String url = host+"/"+fileName;
            return url;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

}
