package com.xl.crud.dao;

import com.xl.crud.bean.PK;
import com.xl.crud.bean.PKExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PKMapper {
    long countByExample(PKExample example);

    int deleteByExample(PKExample example);

    int deleteByPrimaryKey(Integer pkid);

    int insert(PK record);

    int insertSelective(PK record);

    List<PK> selectByExample(PKExample example);

    PK selectByPrimaryKey(Integer pkid);
    
    PK selectPlayingKey(Integer playing);

    int updateByExampleSelective(@Param("record") PK record, @Param("example") PKExample example);

    int updateByExample(@Param("record") PK record, @Param("example") PKExample example);

    int updateByPrimaryKeySelective(PK record);

    int updateByPrimaryKey(PK record);
}