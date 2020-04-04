package com.xl.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.crud.bean.PK;
import com.xl.crud.dao.PKMapper;

@Service
public class PKService {
	
	
	@Autowired
	PKMapper pKMapper;
	
	/**
	 * 选手添加
	 * @param voting
	 */
	public void savepk(PK pk) {
		// TODO Auto-generated method stub
		pKMapper.insertSelective(pk);
	}
	/**
	 * 查询所有选手
	 * @return
	 */

	public List<PK> getPksinger() {
		// TODO Auto-generated method stub
		List<PK> list=pKMapper.selectByExample(null);
		return list;
	}
	/**
	 * 根据比赛状态查询选手
	 * @return
	 */
	public PK getSinger() {
		// TODO Auto-generated method stub
		PK pk=pKMapper.selectPlayingKey(null);
		return pk;
	}

}
