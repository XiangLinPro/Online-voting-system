package com.xl.crud.controller;


import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	
	/*@RequestMapping(value="/toupiao/{singerid}",method=RequestMethod.PUT)
	@ResponseBody
	public Msg uodataCore(@PathVariable("singerid")String singerid) {
		Integer id=Integer.parseInt(singerid);
		votingService.updataCore(id);
		return Msg.success();
		
	}*/
	
	/**
	 * @ResponseBody
	@RequestMapping(value="/empxx/{ids}",method=RequestMethod.DELETE)
	public Msg deleteEmp(@PathVariable("ids")String ids) {
		//批量删除
		if(ids.contains("-")) {
			List<Integer> del_ids=new ArrayList<Integer>();
			String[] str_ids=ids.split("-");
			//组装id集合
			for (String string : str_ids) {
				del_ids.add(Integer.parseInt(string));
			}
			employeeService.deleteBatch(del_ids);
		}else {
			Integer id=Integer.parseInt(ids);
			employeeService.deleteEmp(id);
			
		}
		return Msg.success();
	
		
	}
	 */

}
