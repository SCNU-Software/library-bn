package com.scnu.library.controller;

import com.scnu.library.model.requestModel.alterFundProjectReq;
import com.scnu.library.model.requestModel.deleteFundProjectReq;
import com.scnu.library.model.requestModel.getFundProjectReq;
import com.scnu.library.model.responseModel.getFundProjectRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.fundProjectService;
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
 * @Date: 2019/12/22 15:06
 *
 * * @Edit: Fisher@2019-12-23: 由于配置了全局的CORS Filter，删除@CrossOrigin注解
 */

@Api(value = "Fund Project Controller")
@RestController
@RequestMapping(value = "/api/fundproject")
@Slf4j
public class fundProjectController {

    @Autowired
    private fundProjectService fundProjectService;

    @ApiOperation(value = "获取基金项目信息", notes = "可以根据以下字段进行查询，字段留空表示该查询条件不生效，其中带*号的支持模糊查询：" +
            "项目批准号(no)，" +
            "项目类别(project_category)，" +
            "学科分类(subject_category)，" +
            "*项目名称(name)，" +
            "立项时间(project_date)，" +
            "*项目负责人(principal)，" +
            "*工作单位(main_employer)，" +
            "*二级单位(sub_employer)，" +
            "基金级别(fund_level)")
    @GetMapping("/getfundproject")
    @ResponseBody
    public resultModel<getFundProjectRes> getFundProject(getFundProjectReq req) {
        resultModel<getFundProjectRes> res = new resultModel<>();
        Map<String, Object> resMap = fundProjectService.getFundProject(req);
        res.setData((List<getFundProjectRes>) resMap.get(commonEnum.RESULT_MAP_LIST));
        res.setPageInfo((int) resMap.get(commonEnum.RESULT_MAP_CURRENT_PAGE), (int) resMap.get(commonEnum.RESULT_MAP_TOTAL_PAGE));
        res.setOk();
        return res;
    }

    @ApiOperation(value = "增加一条基金项目信息", notes = "除了项目批准号(no)必填之外，其他的字段都可以先留空")
    @PostMapping("/addfundproject")
    @ResponseBody
    public resultModel addFundProject(@RequestBody alterFundProjectReq req) {
        resultModel res = new resultModel();
        if (fundProjectService.addFundProject(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }

    @ApiOperation(value = "修改一条基金项目信息", notes = "项目批准号(no)是必要字段，其他字段如果留空，则表示该字段不需要更新")
    @PostMapping("/alterfundproject")
    @ResponseBody
    public resultModel<getFundProjectRes> alterFundProject(@RequestBody alterFundProjectReq req) {
        resultModel<getFundProjectRes> res = new resultModel<>();
        List<getFundProjectRes> list = new LinkedList<>();
        getFundProjectRes model = fundProjectService.alterFundProject(req);
        list.add(model);
        res.setData(list);
        res.setOk();
        return res;
    }

    @ApiOperation(value = "删除一条基金项目信息", notes = "根据项目批准号(no)删除基金项目信息")
    @PostMapping("/deletefundproject")
    @ResponseBody
    public resultModel deleteFundProject(@RequestBody deleteFundProjectReq req) {
        resultModel res = new resultModel();
        if (fundProjectService.deleteFundProject(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }
}
