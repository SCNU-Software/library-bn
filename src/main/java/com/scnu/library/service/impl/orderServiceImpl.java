package com.scnu.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scnu.library.mapper.orderMainMapper;
import com.scnu.library.model.dbModel.orderMain;
import com.scnu.library.model.dbModel.orderMainExample;
import com.scnu.library.model.requestModel.addOrderReq;
import com.scnu.library.model.requestModel.alterOrderReq;
import com.scnu.library.model.requestModel.getOrderReq;
import com.scnu.library.model.responseModel.getOrderRes;
import com.scnu.library.service.orderService;
import com.scnu.library.tools.enums.commonEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2020/5/21 11:24
 */

@Repository
@Slf4j
public class orderServiceImpl implements orderService {

    @Autowired
    private orderMainMapper orderMapper;

    @Override
    public boolean addOrder(addOrderReq requestModel) {
        try {
            orderMain model = new orderMain();
            BeanUtils.copyProperties(requestModel, model);
            model.setStatus(0);
            orderMapper.insertSelective(model);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public Map<String, Object> getOrderByUserName(getOrderReq requestModel) {
        Map<String,Object> resMap = new HashMap<>();
        List<getOrderRes> resList = new LinkedList<>();
        try {
            orderMainExample orderExample = new orderMainExample();
            orderMainExample.Criteria criteria = orderExample.createCriteria();

            // 根据用户名查询，同时订单状态status要为0
            criteria.andUserNameEqualTo(requestModel.getUserName());
            criteria.andStatusEqualTo(0);

            // 分页支持
            PageHelper.startPage(requestModel.getPageNo(), requestModel.getPageSize());

            // 执行查询，获取查询结果和分页信息
            List<orderMain> list = orderMapper.selectByExample(orderExample);
            PageInfo<orderMain> pageInfo = new PageInfo<>(list);

            // 打包结果
            for (orderMain x : list) {
                getOrderRes model = new getOrderRes();
                BeanUtils.copyProperties(x, model);
                resList.add(model);
            }
            resMap.put(commonEnum.RESULT_MAP_LIST, resList);
            resMap.put(commonEnum.RESULT_MAP_CURRENT_PAGE, pageInfo.getPageNum());
            resMap.put(commonEnum.RESULT_MAP_TOTAL_PAGE, pageInfo.getPages());
            return resMap;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean alterOrder(alterOrderReq requestModel) {
        try {
            orderMain model = new orderMain();
            BeanUtils.copyProperties(requestModel, model);
            orderMapper.updateByPrimaryKeySelective(model);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
