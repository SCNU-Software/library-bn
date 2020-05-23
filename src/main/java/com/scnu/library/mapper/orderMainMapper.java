package com.scnu.library.mapper;

import com.scnu.library.model.dbModel.orderMain;
import com.scnu.library.model.dbModel.orderMainExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface orderMainMapper {
    long countByExample(orderMainExample example);

    int deleteByExample(orderMainExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(orderMain record);

    int insertSelective(orderMain record);

    List<orderMain> selectByExample(orderMainExample example);

    orderMain selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") orderMain record, @Param("example") orderMainExample example);

    int updateByExample(@Param("record") orderMain record, @Param("example") orderMainExample example);

    int updateByPrimaryKeySelective(orderMain record);

    int updateByPrimaryKey(orderMain record);
}