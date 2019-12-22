package com.scnu.library.controller;

import com.scnu.library.model.requestModel.alterBookDesReq;
import com.scnu.library.model.requestModel.deleteBookDesReq;
import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.bookDesService;
import com.scnu.library.tools.enums.commonEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 16:03
 *
 * @Edit: Fisher@2019-12-22: 增加修改书本信息，添加单条书本信息，删除书本信息接口
 */

@Api(value = "Book Des Controller")
@RestController
@RequestMapping(value = "/api/bookdes")
@Slf4j
@CrossOrigin(allowCredentials = "true")
public class bookDesController {

    @Autowired
    private bookDesService bookDesService;

    @ApiOperation(value = "检索词条", notes = "title和author字段可以同时设置搜索条件，但不能同时为null或空字符串。当pageNo为0时关闭分页，不为0时开启分页。")
    @GetMapping("/getbookdes")
    @ResponseBody
    public resultModel<getBookDesRes> getBookDes(getBookDesReq req) {
        resultModel<getBookDesRes> res = new resultModel<>();
        Map<String, Object> resMap = bookDesService.getBookDes(req);
        res.setData((List<getBookDesRes>) resMap.get(commonEnum.RESULT_MAP_LIST));
        res.setPageInfo((int) resMap.get(commonEnum.RESULT_MAP_CURRENT_PAGE), (int) resMap.get(commonEnum.RESULT_MAP_TOTAL_PAGE));
        res.setOk();
        return res;
    }

    @ApiOperation(value = "添加一个词条", notes = "不会返回插入的词条ID，需要手动刷新")
    @PostMapping("/addbookdes")
    @ResponseBody
    public resultModel addBookDes(alterBookDesReq req) {
        resultModel res = new resultModel();
        if (bookDesService.addBookDes(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }

    @ApiOperation(value = "更新一个词条", notes = "词条id不能为空")
    @PostMapping("/alterbookdes")
    @ResponseBody
    public resultModel<getBookDesRes> alterBookDes(alterBookDesReq req) {
        resultModel<getBookDesRes> res = new resultModel<>();
        if (StringUtils.isEmpty(req.getId())) {
            res.setFail();
            res.setMsg("词条ID不能为空!");
            return res;
        }
        List<getBookDesRes> list = new LinkedList<>();
        list.add(bookDesService.alterBookDes(req));
        res.setData(list);
        res.setOk();
        return res;
    }

    @ApiOperation(value = "删除一个词条", notes = "根据词条ID删除一个词条")
    @PostMapping("/deletebookdes")
    @ResponseBody
    public resultModel deleteBookDes(deleteBookDesReq req) {
        resultModel res = new resultModel();
        if (bookDesService.deleteBookDes(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }
}
