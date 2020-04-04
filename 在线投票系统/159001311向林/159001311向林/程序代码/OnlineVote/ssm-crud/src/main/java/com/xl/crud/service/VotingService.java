package com.xl.crud.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.crud.bean.Voting;
import com.xl.crud.dao.VotingMapper;

@Service
public class VotingService {
	
	@Autowired
	static
	VotingMapper votingMapper;

/**
 * —° ÷ÃÌº”
 * @param ids
 *//*
	public static void getBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		VotingExample example=new VotingExample();
		Criteria criteria=example.createCriteria();
		criteria.andSingeridIn(ids);
		votingMapper.insertSelective(record)
		
		
	}*/

	public void saveVop(Voting voting) {
		// TODO Auto-generated method stub
		votingMapper.insertSelective(voting);
	}

/*public void updataCore(Integer singerid) {
	// TODO Auto-generated method stub
	votingMapper.updateBysingeridKey(singerid);
	
}*/

}
