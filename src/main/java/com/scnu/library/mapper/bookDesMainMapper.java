package com.scnu.library.mapper;

import com.scnu.library.model.dbModel.bookDesMain;
import com.scnu.library.model.dbModel.bookDesMainExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface bookDesMainMapper {
    long countByExample(bookDesMainExample example);

    int deleteByExample(bookDesMainExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(bookDesMain record);

    int insertSelective(bookDesMain record);

    List<bookDesMain> selectByExampleWithBLOBs(bookDesMainExample example);

    List<bookDesMain> selectByExample(bookDesMainExample example);

    bookDesMain selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") bookDesMain record, @Param("example") bookDesMainExample example);

    int updateByExampleWithBLOBs(@Param("record") bookDesMain record, @Param("example") bookDesMainExample example);

    int updateByExample(@Param("record") bookDesMain record, @Param("example") bookDesMainExample example);

    int updateByPrimaryKeySelective(bookDesMain record);

    int updateByPrimaryKeyWithBLOBs(bookDesMain record);

    int updateByPrimaryKey(bookDesMain record);
}