package com.scnu.library.controller;

import com.scnu.library.model.requestModel.alterPatentReq;
import com.scnu.library.model.requestModel.deletePatentReq;
import com.scnu.library.model.requestModel.getPatentReq;
import com.scnu.library.model.responseModel.getPatentRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.patentService;
import com.scnu.library.tools.enums.commonEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 11:23
 */

@Api(value = "Patent Controller")
@RestController
@RequestMapping(value = "api/patent")
@Slf4j
@CrossOrigin(allowCredentials = "true")
public class patentController {

    @Autowired
    private patentService patentService;

    @ApiOperation(value = "查询专利", notes = "可以根据以下字段进行查询，字段留空表示该查询条件不生效，其中带*号的支持模糊查询：" +
            "专利国别(patent_country)，" +
            "专利类型(patent_type)，" +
            "*专利名称(name)，" +
            "公开日(publish_date)，" +
            "申请日(application_date)，" +
            "主分类号(main_category)，" +
            "分类号(sub_category)，" +
            "*申请人(applicant)，" +
            "*发明人(inventor)，" +
            "法律状态(legal_status)，" +
            "专利状态(patent_status)，" +
            "二级机构(secondary_institution)")
    @GetMapping("/getpatent")
    @ResponseBody
    public resultModel<getPatentRes> getPatent(getPatentReq req) {
        resultModel<getPatentRes> res = new resultModel<>();
        Map<String, Object> resMap = patentService.getPatent(req);
        res.setData( (List<getPatentRes>) resMap.get(commonEnum.RESULT_MAP_LIST));
        res.setPageInfo((int) resMap.get(commonEnum.RESULT_MAP_CURRENT_PAGE), (int) resMap.get(commonEnum.RESULT_MAP_TOTAL_PAGE));
        res.setOk();
        return res;
    }

    @ApiOperation(value = "增加一条专利", notes = "除了专利编号(no)是必填字段之外，其他字段都可以暂时留空")
    @PostMapping("/addpatent")
    @ResponseBody
    public resultModel addPatent(@RequestBody alterPatentReq req) {
        resultModel res = new resultModel();
        if (patentService.addPatent(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }

    @ApiOperation(value = "修改专利", notes = "专利编号(no)是必要字段，如果其他字段留空，则表示该字段不需要更新")
    @PostMapping("/alterpatent")
    @ResponseBody
    public resultModel<getPatentRes> alterPatent(@RequestBody alterPatentReq req) {
        resultModel<getPatentRes> res = new resultModel<>();
        List<getPatentRes> list = new LinkedList<>();
        getPatentRes model = patentService.alterPatent(req);
        list.add(model);
        res.setData(list);
        res.setOk();
        return res;
    }

    @ApiOperation(value = "删除一条专利", notes = "根据专利编号(no)来删除专利")
    @PostMapping("/deletepatent")
    @ResponseBody
    public resultModel deletePatent(@RequestBody deletePatentReq req) {
        resultModel res = new resultModel();
        if (patentService.deletePatent(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }
}
