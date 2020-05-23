package com.scnu.library.mapper;

import com.scnu.library.model.dbModel.userMain;
import com.scnu.library.model.dbModel.userMainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface userMainMapper {
    long countByExample(userMainExample example);

    int deleteByExample(userMainExample example);

    int deleteByPrimaryKey(String userName);

    int insert(userMain record);

    int insertSelective(userMain record);

    List<userMain> selectByExample(userMainExample example);

    userMain selectByPrimaryKey(String userName);

    int updateByExampleSelective(@Param("record") userMain record, @Param("example") userMainExample example);

    int updateByExample(@Param("record") userMain record, @Param("example") userMainExample example);

    int updateByPrimaryKeySelective(userMain record);

    int updateByPrimaryKey(userMain record);
}