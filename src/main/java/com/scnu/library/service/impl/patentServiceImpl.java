package com.scnu.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scnu.library.mapper.patentMainMapper;
import com.scnu.library.model.dbModel.patentMain;
import com.scnu.library.model.dbModel.patentMainExample;
import com.scnu.library.model.requestModel.alterPatentReq;
import com.scnu.library.model.requestModel.deletePatentReq;
import com.scnu.library.model.requestModel.getPatentReq;
import com.scnu.library.model.responseModel.getPatentRes;
import com.scnu.library.service.patentService;
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
 * @Date: 2019/12/22 10:32
 */

@Repository
@Slf4j
public class patentServiceImpl implements patentService {

    @Autowired
    private patentMainMapper patentMapper;

    @Override
    public Map<String, Object> getPatent(getPatentReq requestModel) {
        Map<String, Object> resMap = new HashMap<>();
        List<getPatentRes> resList = new LinkedList<>();
        try {
            patentMainExample patentMainExample = new patentMainExample();
            patentMainExample.Criteria criteria = patentMainExample.createCriteria();

            // 需要根据申请人查询
            if (!StringUtils.isEmpty(requestModel.getApplicant())) {
                criteria.andApplicantLike('%'+requestModel.getApplicant()+'%');
            }

            // 需要根据申请日查询
            if (requestModel.getApplication_date() != null) {
                criteria.andApplicationDateEqualTo(requestModel.getApplication_date());
            }

            // 需要根据发明人查询
            if (!StringUtils.isEmpty(requestModel.getInventor())) {
                criteria.andInventorLike('%'+requestModel.getInventor()+'%');
            }

            // 需要根据法律状态查询
            if (!StringUtils.isEmpty(requestModel.getLegal_status())) {
                criteria.andLegalStatusEqualTo(requestModel.getLegal_status());
            }

            // 需要根据主分类号查询
            if (!StringUtils.isEmpty(requestModel.getMain_category())) {
                criteria.andMainCategoryEqualTo(requestModel.getMain_category());
            }

            // 需要根据专利名称查询
            if (!StringUtils.isEmpty(requestModel.getName())) {
                criteria.andNameLike('%'+requestModel.getName()+'%');
            }

            // 需要根据专利国别查询
            if (!StringUtils.isEmpty(requestModel.getPatent_country())) {
                criteria.andPatentCountryEqualTo(requestModel.getPatent_country());
            }

            // 需要根据专利状态查询
            if (!StringUtils.isEmpty(requestModel.getPatent_status())) {
                criteria.andPatentStatusEqualTo(requestModel.getPatent_status());
            }

            // 需要根据专利类别查询
            if (!StringUtils.isEmpty(requestModel.getPatent_type())) {
                criteria.andPatentTypeEqualTo(requestModel.getPatent_type());
            }

            // 需要根据公开日查询
            if (requestModel.getPublish_date() != null) {
                criteria.andPublishDateEqualTo(requestModel.getPublish_date());
            }

            // 需要根据二级机构查询
            if (!StringUtils.isEmpty(requestModel.getSecondary_institution())) {
                criteria.andSecondaryInstitutionEqualTo(requestModel.getSecondary_institution());
            }

            // 分页
            PageHelper.startPage(requestModel.getPageNo(), requestModel.getPageSize());

            // 执行查询
            List<patentMain> list = patentMapper.selectByExample(patentMainExample);
            PageInfo<patentMain> pageInfo = new PageInfo<>(list);

            // 打包结果
            for (patentMain x : list) {
                getPatentRes model = new getPatentRes();
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
    public boolean addPatent(alterPatentReq requestModel) {
        try {
            // 添加专利条目
            patentMain model = new patentMain();
            BeanUtils.copyProperties(requestModel, model);
            patentMapper.insertSelective(model);
            // 返回添加结果
            getPatentRes res = new getPatentRes();
            BeanUtils.copyProperties(model, res);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean deletePatent(deletePatentReq requestModel) {
        try {
            patentMapper.deleteByPrimaryKey(requestModel.getNo());
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public getPatentRes alterPatent(alterPatentReq requestModel) {
        try {
            // 修改专利条目
            patentMain model = new patentMain();
            BeanUtils.copyProperties(requestModel, model);
            patentMapper.updateByPrimaryKeySelective(model);
            // 返回修改结果
            getPatentRes res = new getPatentRes();
            BeanUtils.copyProperties(model, res);
            return res;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
