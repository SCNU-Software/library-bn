package com.scnu.library.service;

import com.scnu.library.model.requestModel.addOrderReq;
import com.scnu.library.model.requestModel.alterOrderReq;
import com.scnu.library.model.requestModel.getOrderReq;

import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:11
 */
public interface orderService {
    // 添加订单
    boolean addOrder(addOrderReq requestModel);
    // 根据用户名查询订单信息
    Map<String, Object> getOrderByUserName(getOrderReq requestModel);
    // 取消订单
    boolean alterOrder(alterOrderReq requestModel);
}
