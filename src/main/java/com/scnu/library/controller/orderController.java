package com.scnu.library.controller;

import com.scnu.library.model.requestModel.addOrderReq;
import com.scnu.library.model.requestModel.alterOrderReq;
import com.scnu.library.model.requestModel.getOrderReq;
import com.scnu.library.model.responseModel.getOrderRes;
import com.scnu.library.model.resultModel;
import com.scnu.library.service.orderService;
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
 * @Date: 2020/5/21 11:42
 */

@Api(value = "Order Controller")
@RestController
@RequestMapping(value = "/api/order")
@Slf4j
public class orderController {

    @Autowired
    private orderService orderService;

    @ApiOperation(value = "添加订单", notes = "userName为用户名，bookTitle为书名，price为订单总价，address为收货地址，phone为联系电话，card为支付卡号")
    @PostMapping("/addorder")
    @ResponseBody
    public resultModel addOrder(@RequestBody addOrderReq req) {
        resultModel res = new resultModel();
        if (orderService.addOrder(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }

    @ApiOperation(value = "根据用户名获取订单", notes = "userName为用户名")
    @GetMapping("/getorder")
    @ResponseBody
    public resultModel<getOrderRes> getOrderByUserName(getOrderReq req) {
        resultModel<getOrderRes> res = new resultModel<>();
        Map<String, Object> resMap = orderService.getOrderByUserName(req);
        res.setData((List<getOrderRes>) resMap.get(commonEnum.RESULT_MAP_LIST));
        res.setPageInfo((int) resMap.get(commonEnum.RESULT_MAP_CURRENT_PAGE), (int) resMap.get(commonEnum.RESULT_MAP_TOTAL_PAGE));
        res.setOk();
        return res;
    }

    @ApiOperation(value = "修改订单", notes = "orderId为订单ID，status为订单状态，0表示订单生效，1表示订单取消")
    @PostMapping("/alterorder")
    @ResponseBody
    public resultModel alterOrder(@RequestBody alterOrderReq req) {
        resultModel res = new resultModel();
        if (orderService.alterOrder(req)) {
            res.setOk();
        } else {
            res.setFail();
        }
        return res;
    }

}
