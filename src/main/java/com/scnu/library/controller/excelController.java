package com.scnu.library.controller;

import com.scnu.library.model.requestModel.*;
import com.scnu.library.model.responseModel.exportExcelRes;
import com.scnu.library.model.responseModel.getExcelRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.bookDesService;
import com.scnu.library.service.excelService;
import com.scnu.library.tools.enums.responseEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;

/**
 * @Author JabinGP
 * @Date 2019-11-26 20:57
 *
 * @Edit: Fisher@2019-12-23: 由于配置了全局的CORS Filter，删除@CrossOrigin注解
 */

@Api(value = "Excel Controller")
@RestController
@RequestMapping(value = "/api/excel")
@Slf4j
public class excelController {
    @Autowired
    private bookDesService bookDesService;
    @Autowired
    private excelService excelService;
    @Value("${spring.fileupload.location}")
    private String location;

    @ApiOperation(value = "从excel导入", notes = "传入excel文件，读取excel中的数据并写入数据库，excel格式需要符合规范。")
    @PostMapping("/bookinfo")
    @ResponseBody
    public resultModel importExcel(importExcelReq req) throws Exception {
        MultipartFile excelFile = req.getExcelFile();
        // 校验传入文件有效性
        if (excelFile.isEmpty()){
            log.info("没有读取到传入文件");
            throw new RuntimeException("文件传入错误");
        }
        log.info("文件上传成功");
        // 存储excel文件
        String fileName = new Date().getTime()+"_"+excelFile.getOriginalFilename();
        File dest = new File(location + "/" + fileName);
        excelFile.transferTo(dest);
        log.info("文件保存成功");

        // 读取并存储到数据库
        excelService.importExcel(location + "/" + fileName);
        // 无异常正常返回
        resultModel res = new resultModel(responseEnum.OK,responseEnum.OK_MSG,null);
        return res;
    }

    @ApiOperation(value = "导出excel", notes = "传入关键字指定对应数据，导出为excel文件并返回url")
    @GetMapping("/bookinfo")
    @ResponseBody
    public resultModel<exportExcelRes> exportExcel(exportExcelReq req) throws Exception {
        resultModel<exportExcelRes> res = new resultModel<exportExcelRes>();

        // 生成excel文件，返回url
        String url = excelService.exportExcel(req);

        // 构建返回信息
        exportExcelRes excelRes = new exportExcelRes();
        excelRes.setUrl(url);

        ArrayList<exportExcelRes> dataList = new ArrayList<exportExcelRes>();
        dataList.add(excelRes);

        res.setData(dataList);
        res.setOk();
        return res;
    }

    @ApiOperation(value = "excel批量导入基金项目", notes = "上传一个excel文件，通过读取excel中的数据，将所有数据导入数据库")
    @PostMapping("/addfundproject")
    public resultModel addFundProjectExcel(addExcelReq req)throws Exception {
        MultipartFile excelFile = req.getExcelFile();
        // 校验传入文件有效性
        if (excelFile.isEmpty()){
            log.info("没有读取到传入文件");
            throw new RuntimeException("文件传入错误");
        }
        log.info("文件上传成功");
        // 存储excel文件
        String fileName = new Date().getTime()+"_"+excelFile.getOriginalFilename();
        File dest = new File(location + "/" + fileName);
        excelFile.transferTo(dest);
        log.info("文件保存成功");

        // 读取并存储到数据库
        excelService.addFundProjectExcel(location + "/" + fileName);
        // 无异常正常返回
        resultModel res = new resultModel(responseEnum.OK,responseEnum.OK_MSG,null);
        return res;
    }

    @ApiOperation(value = "在服务器生成基金项目Excel并返回下载链接", notes = "根据搜索条件生成基金项目excel保存在服务器，并返回下载链接")
    @GetMapping("/getfundproject")
    public resultModel<getExcelRes> getFundProjectExcel(getFundProjectReq req)throws Exception {
        resultModel<getExcelRes> res = new resultModel<getExcelRes>();

        // 生成excel文件并返回url
        String url = excelService.getFundProjectExcel(req);

        // 构建返回信息
        getExcelRes excelRes = new getExcelRes();
        excelRes.setUrl(url);

        ArrayList<getExcelRes> dataList = new ArrayList<getExcelRes>();
        dataList.add(excelRes);

        res.setData(dataList);
        res.setOk();
        return res;
    }

    @ApiOperation(value = "excel批量导入专利", notes = "上传一个excel文件，通过读取excel中的数据，将所有数据导入数据库")
    @PostMapping("/addpatent")
    public resultModel addPatentExcel(addExcelReq req)throws Exception {
        MultipartFile excelFile = req.getExcelFile();
        // 校验传入文件有效性
        if (excelFile.isEmpty()){
            log.info("没有读取到传入文件");
            throw new RuntimeException("文件传入错误");
        }
        log.info("文件上传成功");
        // 存储excel文件
        String fileName = new Date().getTime()+"_"+excelFile.getOriginalFilename();
        File dest = new File(location + "/" + fileName);
        excelFile.transferTo(dest);
        log.info("文件保存成功");

        // 读取并存储到数据库
        excelService.addPatentExcel(location + "/" + fileName);
        // 无异常正常返回
        resultModel res = new resultModel(responseEnum.OK,responseEnum.OK_MSG,null);
        return res;
    }

    @ApiOperation(value = "在服务器生成专利Excel并返回下载链接", notes = "根据搜索条件生成专利excel保存在服务器，并返回下载链接")
    @GetMapping("/getpatent")
    public resultModel<getExcelRes> getPatentExcel(getPatentReq req)throws Exception {
        resultModel<getExcelRes> res = new resultModel<getExcelRes>();

        // 生成excel文件并返回url
        String url = excelService.getPatentExcel(req);

        // 构建返回信息
        getExcelRes excelRes = new getExcelRes();
        excelRes.setUrl(url);

        ArrayList<getExcelRes> dataList = new ArrayList<getExcelRes>();
        dataList.add(excelRes);

        res.setData(dataList);
        res.setOk();
        return res;
    }

}
