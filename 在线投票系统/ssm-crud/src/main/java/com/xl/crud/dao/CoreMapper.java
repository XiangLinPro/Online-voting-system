package com.xl.crud.dao;

import com.xl.crud.bean.Core;
import com.xl.crud.bean.CoreExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CoreMapper {
    long countByExample(CoreExample example);

    int deleteByExample(CoreExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Core record);

    int insertSelective(Core record);

    List<Core> selectByExample(CoreExample example);

    Core selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Core record, @Param("example") CoreExample example);

    int updateByExample(@Param("record") Core record, @Param("example") CoreExample example);

    int updateByPrimaryKeySelective(Core record);

    int updateByPrimaryKey(Core record);
}