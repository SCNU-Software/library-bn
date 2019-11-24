package com.scnu.library.controller;

import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.bookDesService;
import com.scnu.library.tools.enums.commonEnum;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/11/24 16:03
 */

@Api(value = "Book Des Controller")
@RestController
@RequestMapping(value = "/api/bookdes")
@Slf4j
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
}
