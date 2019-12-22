package com.scnu.library.mapper;

import com.scnu.library.model.dbModel.patentMain;
import com.scnu.library.model.dbModel.patentMainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface patentMainMapper {
    long countByExample(patentMainExample example);

    int deleteByExample(patentMainExample example);

    int deleteByPrimaryKey(Integer no);

    int insert(patentMain record);

    int insertSelective(patentMain record);

    List<patentMain> selectByExample(patentMainExample example);

    patentMain selectByPrimaryKey(Integer no);

    int updateByExampleSelective(@Param("record") patentMain record, @Param("example") patentMainExample example);

    int updateByExample(@Param("record") patentMain record, @Param("example") patentMainExample example);

    int updateByPrimaryKeySelective(patentMain record);

    int updateByPrimaryKey(patentMain record);
}