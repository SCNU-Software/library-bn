package com.scnu.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scnu.library.mapper.fundProjectMainMapper;
import com.scnu.library.model.dbModel.fundProjectMain;
import com.scnu.library.model.dbModel.fundProjectMainExample;
import com.scnu.library.model.requestModel.alterFundProjectReq;
import com.scnu.library.model.requestModel.deleteFundProjectReq;
import com.scnu.library.model.requestModel.getFundProjectReq;
import com.scnu.library.model.responseModel.getFundProjectRes;
import com.scnu.library.service.fundProjectService;
import com.scnu.library.tools.enums.commonEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * @Author: Fisher
 * @Date: 2019/12/22 12:29
 */

@Repository
@Slf4j
public class fundProjectServiceImpl implements fundProjectService {

    @Autowired
    private fundProjectMainMapper fundProjectMapper;

    @Override
    public Map<String, Object> getFundProject(getFundProjectReq requestModel) {
        Map<String, Object> resMap = new HashMap<>();
        List<getFundProjectRes> resList = new LinkedList<>();
        try {
            fundProjectMainExample fundProjectExample = new fundProjectMainExample();
            fundProjectMainExample.Criteria criteria = fundProjectExample.createCriteria();

            // 根据基金级别查询
            if (!StringUtils.isEmpty(requestModel.getFund_level())) {
                criteria.andFundLevelEqualTo(requestModel.getFund_level());
            }

            // 根据工作单位查询
            if (!StringUtils.isEmpty(requestModel.getMain_employer())) {
                criteria.andMainEmployerLike('%'+requestModel.getMain_employer()+'%');
            }

            // 根据二级单位查询
            if (!StringUtils.isEmpty(requestModel.getSub_employer())) {
                criteria.andSubEmployerLike('%'+requestModel.getSub_employer()+'%');
            }

            // 根据项目名称查询
            if (!StringUtils.isEmpty(requestModel.getName())) {
                criteria.andNameLike('%'+requestModel.getName()+'%');
            }

            // 根据项目批准号查询
            if (!StringUtils.isEmpty(requestModel.getNo())) {
                criteria.andNameEqualTo(requestModel.getNo());
            }

            // 根据项目负责人查询
            if (!StringUtils.isEmpty(requestModel.getPrincipal())) {
                criteria.andPrincipalLike('%'+requestModel.getPrincipal()+'%');
            }

            // 根据项目类别查询
            if (!StringUtils.isEmpty(requestModel.getProject_category())) {
                criteria.andProjectCategoryEqualTo(requestModel.getProject_category());
            }

            // 根据学科分类查询
            if (!StringUtils.isEmpty(requestModel.getSubject_category())) {
                criteria.andSubjectCategoryEqualTo(requestModel.getSubject_category());
            }

            // 根据立项时间查询
            if (requestModel.getProject_date()!=null) {
                criteria.andProjectDateEqualTo(requestModel.getProject_date());
            }

            // 分页
            PageHelper.startPage(requestModel.getPageNo(), requestModel.getPageSize());

            // 执行查询
            List<fundProjectMain> list = new LinkedList<>();
            PageInfo<fundProjectMain> pageInfo = new PageInfo<>(list);

            // 打包结果
            for (fundProjectMain x : list) {
                getFundProjectRes model = new getFundProjectRes();
                BeanUtils.copyProperties(x, model);
                resList.add(model);
            }
            resMap.put(commonEnum.RESULT_MAP_LIST, resList);
            resMap.put(commonEnum.RESULT_MAP_CURRENT_PAGE, pageInfo.getPageNum());
            resMap.put(commonEnum.RESULT_MAP_TOTAL_PAGE, pageInfo.getPages());

        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        } finally {
            return resMap;
        }
    }

    @Override
    public getFundProjectRes alterFundProject(alterFundProjectReq requestModel) {
        try {
            fundProjectMain model = new fundProjectMain();
            BeanUtils.copyProperties(requestModel, model);
            // 更新项目信息
            fundProjectMapper.updateByPrimaryKeySelective(model);
            // 返回更新信息
            getFundProjectRes res = new getFundProjectRes();
            BeanUtils.copyProperties(model, res);
            return res;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean addFundProject(alterFundProjectReq requestModel) {
        try {
            fundProjectMain model = new fundProjectMain();
            BeanUtils.copyProperties(requestModel, model);
            // 插入项目信息
            fundProjectMapper.insertSelective(model);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean deleteFundProject(deleteFundProjectReq requestModel) {
        try {
            fundProjectMapper.deleteByPrimaryKey(requestModel.getNo());
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
