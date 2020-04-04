package com.xl.crud.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.crud.bean.Msg;
import com.xl.crud.bean.Voting;
import com.xl.crud.service.VotingService;

@Controller
public class VotingController {
	
	@Autowired
	VotingService votingService;
	
	@RequestMapping(value="/vop",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Voting voting) {
		votingService.saveVop(voting);
		return Msg.success();
		
	}
	
	

}
