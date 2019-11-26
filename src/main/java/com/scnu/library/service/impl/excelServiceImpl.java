package com.scnu.library.service.impl;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.scnu.library.listener.ExcelReadListener;
import com.scnu.library.mapper.bookDesMainMapper;
import com.scnu.library.model.dbModel.bookDesMain;
import com.scnu.library.model.excelMode.bookExcelModel;
import com.scnu.library.model.requestModel.exportExcelReq;
import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.requestModel.importExcelReq;
import com.scnu.library.model.responseModel.exportExcelRes;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.model.responseModel.importExcelRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.bookDesService;
import com.scnu.library.service.excelService;
import com.scnu.library.tools.enums.commonEnum;
import com.scnu.library.tools.enums.responseEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
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
    private bookDesMainMapper bookDao;
    @Autowired
    private bookDesService bookDesService;

    public void importExcel(String fileName) throws Exception{
        // 读取excel并存储到数据库
        ExcelReader excelReader = EasyExcel.read(fileName, bookExcelModel.class, new ExcelReadListener(bookDao)).build();
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

        /// 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();

        // 返回下载链接
        String url = host+"/"+fileName;

        return url;
    }
}
