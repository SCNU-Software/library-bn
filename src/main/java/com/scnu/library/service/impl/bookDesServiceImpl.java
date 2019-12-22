package com.scnu.library.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.scnu.library.mapper.bookDesMainMapper;
import com.scnu.library.model.dbModel.bookDesMain;
import com.scnu.library.model.dbModel.bookDesMainExample;
import com.scnu.library.model.requestModel.alterBookDesReq;
import com.scnu.library.model.requestModel.deleteBookDesReq;
import com.scnu.library.model.requestModel.getBookDesReq;
import com.scnu.library.model.responseModel.getBookDesRes;
import com.scnu.library.service.bookDesService;
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
 * @Date: 2019/11/24 12:58
 *
 * @Edit: JabinGP@2019/11/25：修改两处模糊查找漏%
 * @Edit: Fisher@2019-12-22: 增加修改书本信息，添加单条书本信息，删除书本信息接口
 */

@Repository
@Slf4j
public class bookDesServiceImpl implements bookDesService {

    @Autowired
    private bookDesMainMapper bookDesMapper;

    @Override
    public Map<String,Object> getBookDes(getBookDesReq requestModel) {
        Map<String,Object> resMap = new HashMap<>();
        List<getBookDesRes> resList = new LinkedList<>();
        try {
            bookDesMainExample bookDesExample = new bookDesMainExample();
            bookDesMainExample.Criteria criteria = bookDesExample.createCriteria();

            // 需要根据标题查询
            if ( requestModel.getTitle()!=null && !"".equals(requestModel.getTitle()) ) {
                criteria.andTitleLike('%'+requestModel.getTitle()+'%');
            }

            // 需要根据作者查询
            if ( requestModel.getAuthor()!=null && !"".equals(requestModel.getAuthor()) ) {
                criteria.andAuthorLike('%'+requestModel.getAuthor()+'%');
            }

            // 分页支持
            PageHelper.startPage(requestModel.getPageNo(), requestModel.getPageSize());

            // 执行查询，获取查询结果和分页信息
            List<bookDesMain> list = bookDesMapper.selectByExampleWithBLOBs(bookDesExample);
            PageInfo<bookDesMain> pageInfo = new PageInfo<>(list);

            // 打包结果
            for (bookDesMain x : list) {
                getBookDesRes model = new getBookDesRes();
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
    public boolean addBookDes(alterBookDesReq requestModel) {
        try {
            bookDesMain model = new bookDesMain();
            BeanUtils.copyProperties(requestModel, model);
            bookDesMapper.insertSelective(model);
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public getBookDesRes alterBookDes(alterBookDesReq requestModel) {
        try {
            bookDesMain model = new bookDesMain();
            BeanUtils.copyProperties(requestModel, model);
            bookDesMapper.updateByPrimaryKeyWithBLOBs(model);
            // 返回更新后的数据
            getBookDesRes res = new getBookDesRes();
            BeanUtils.copyProperties(model, res);
            return res;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }

    @Override
    public boolean deleteBookDes(deleteBookDesReq requestModel) {
        try {
            bookDesMapper.deleteByPrimaryKey(requestModel.getId());
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
