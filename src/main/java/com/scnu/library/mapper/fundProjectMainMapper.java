package com.scnu.library.mapper;

import com.scnu.library.model.dbModel.fundProjectMain;
import com.scnu.library.model.dbModel.fundProjectMainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface fundProjectMainMapper {
    long countByExample(fundProjectMainExample example);

    int deleteByExample(fundProjectMainExample example);

    int deleteByPrimaryKey(String no);

    int insert(fundProjectMain record);

    int insertSelective(fundProjectMain record);

    List<fundProjectMain> selectByExample(fundProjectMainExample example);

    fundProjectMain selectByPrimaryKey(String no);

    int updateByExampleSelective(@Param("record") fundProjectMain record, @Param("example") fundProjectMainExample example);

    int updateByExample(@Param("record") fundProjectMain record, @Param("example") fundProjectMainExample example);

    int updateByPrimaryKeySelective(fundProjectMain record);

    int updateByPrimaryKey(fundProjectMain record);
}