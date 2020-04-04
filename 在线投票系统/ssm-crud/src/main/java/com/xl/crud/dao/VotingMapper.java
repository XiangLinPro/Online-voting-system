package com.xl.crud.dao;

import com.xl.crud.bean.Voting;
import com.xl.crud.bean.VotingExample;
import com.xl.crud.bean.VotingKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VotingMapper {
    long countByExample(VotingExample example);

    int deleteByExample(VotingExample example);

    int deleteByPrimaryKey(VotingKey key);

    int insert(Voting record);

    int insertSelective(Voting record);

    List<Voting> selectByExample(VotingExample example);

    Voting selectByPrimaryKey(VotingKey key);

    int updateByExampleSelective(@Param("record") Voting record, @Param("example") VotingExample example);

    int updateByExample(@Param("record") Voting record, @Param("example") VotingExample example);

    int updateByPrimaryKeySelective(Voting record);

    int updateByPrimaryKey(Voting record);
}