package com.xl.crud.controller;




import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xl.crud.bean.Msg;
import com.xl.crud.bean.PK;
import com.xl.crud.service.PKService;

@Controller
public class PKController {
	
	@Autowired
	PKService pKService;
	
	@ResponseBody
	@RequestMapping(value="empk",method=RequestMethod.POST)
	public Msg savePk(@Valid PK pk) {
		pKService.savepk(pk);
		return Msg.success();
		
	}
	/*@RequestMapping("/empsp")
	@ResponseBody
	public Msg getEmps() {
		List<Employee> list=employeeService.getEmps();
		return Msg.success().add("empsp", list);
	}*/
	
	
	@RequestMapping("/pksinger")
	@ResponseBody
	public Msg getVoting() {
		
		List<PK> list=pKService.getPksinger();
		return Msg.success().add("pksinger", list);
	}
	
	/**
	 * 根据状态查询选手
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/singer")
	public Msg getSinger() {
		PK pk=pKService.getSinger();
		return Msg.success().add("singer", pk);
		
	}
	

}
