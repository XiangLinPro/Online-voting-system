package com.xl.crud.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xl.crud.bean.Employee;
import com.xl.crud.bean.Msg;
import com.xl.crud.service.EmployeeService;

/**
 * 处理选手CRUD请求
 * @author Administrator
 *
 */
@Controller
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	
	/**
	 * 返回所有选手信息
	 */
	
	@RequestMapping("/empsp")
	@ResponseBody
	public Msg getEmps() {
		List<Employee> list=employeeService.getEmps();
		return Msg.success().add("empsp", list);
	}
	
	/**
	 * 单个批量二合一
	 * 批量：1-2-3
	 * 单个删除：1
	 * @param id
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/emp/{ids}",method=RequestMethod.DELETE)
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
	
	
	/**
	 * 如果直接发送ajax=PUT形式的请求
	 * 封装数据
	 * Employee [empId=4022, empName=null, gender=null, email=null, dId=null, department=null]
	 * 
	 * 问题
	 * 请求中有数据
	 * 但是Employee对象封装不上
	 * update tbl_emp where emp_id=1009
	 * 
	 * 原因
	 * Tomcat ：
	 * 	1、将请求体中的数据，封装成一个map
	 * 2、request.getParameter("empName"")就会从这个map取值
	 * 3、SpringMVC封装POJO对象的时候
	 * 				会把POJO中的每个属性的值，request.getParemeter("email")
	 * AJAX发送PUT请求引发的血案：
	 * 			PUT请求：请求体中的数据：request.getParameter("empName")拿不到
	 * 			Tomcat一看是PUT不会封装请求体当中的数据为map，只有POST形式的请求才会封装请求体
	 * 
	 * 解决方案
	 * 我们要能支持直接发送PUT之类的请求还要封装请求体中的数据
	 * 1、配置上HttpPutFormContentFilter
	 *2、他的作用，将请求体中数据解析包装成一个map
	 *3、request被重新包装，request.getParameter()被重写，就会从自己封装的map中取数据
	 * 
	 * 选手更新方法
	 * @param employee
	 * @return
	 */
	@ResponseBody
	@RequestMapping(value="/emp/{empId}",method=RequestMethod.PUT)
	public Msg saveEmp(Employee employee) {
		System.out.println("将要更新的选手数据"+employee);
		employeeService.updateEmp(employee);
		return Msg.success();
		
	}
	
	/**
	 * 根据id查询选手
	 * @param id
	 * @return
	 */
	@RequestMapping(value="/emp/{id}",method=RequestMethod.GET)
	@ResponseBody
	public Msg getEmp(@PathVariable("id")Integer id) {
		Employee employee=employeeService.getEmp(id);
		return Msg.success().add("emp",employee);
		
	}
	
	/**
	 * 检查用户名是否可用
	 * @param empName
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/checkuser")
	public Msg checkuser(@RequestParam("empName")String empName) {
		//先判断用户名是否是合法的表达式；
		String regx="(^[a-zA-Z0-9_-]{6,16}$)|(^[\u2E80-\u9FFF]{2,5})";
		if(!empName.matches(regx)) {
			return Msg.fail().add("va_msg", "用户名必须是6-12位数字和字母的组合或者2-5为中文");
		}
		//数据库用户名重复校验
		boolean b=employeeService.checkuser(empName);
		if(b) {
			return Msg.success();
		}else {
			return Msg.fail().add("va_msg", "用户名不可用");
		}
	}
	
	/**
	 * 员工保存
	 * 1.支持jsr303校验
	 * 导入hibernate-Validator
	 * @return
	 */
	@RequestMapping(value="/emp",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveEmp(@Valid Employee employee,BindingResult result) {
		if(result.hasErrors()) {
			//校验失败，应该返回失败，在模态框中显示校验失败的信息
			Map<String, Object> map=new HashMap<String, Object>();
			List<FieldError> errors=result.getFieldErrors();
			for (FieldError fieldError : errors) {
				System.out.println("错误的字段名："+fieldError.getField());
				System.out.println("错误信息："+fieldError.getDefaultMessage());
				map.put(fieldError.getField(), fieldError.getDefaultMessage());
				
			}
			return Msg.fail().add("errorFields", map);
		}else {
			
			employeeService.saveEmp(employee);
			return Msg.success();
		}
	}
	
	/**
	 *选中的选手插入到Voting表中
	 */
	
	/**
	 * 导入Jackson包
	 * @param pn
	 * @return
	 */
	@RequestMapping("/emps")
	@ResponseBody//把返回的对象转为json字符串
	public Msg getEmpsWithJson(@RequestParam(value="pn",defaultValue="1")Integer pn) {
		//这不是一个分页查询
				//引入pagehelper分页插件
				//在查询之前只需要调用，传入页码，以及分页每一页的大小
				PageHelper.startPage(pn, 6);
				//startPage后面紧跟的查询就是分页查询
				List<Employee> emps=employeeService.getAll();
				
				//使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了
				//封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数
				PageInfo page=new PageInfo(emps,5);
				return Msg.success().add("pageInfo",page);
	}
	/**
	 * 查询选手数据（分页查询）
	 * @return
	 */
	//@RequestMapping("/emps")
	public String getEmps(@RequestParam(value="pn",defaultValue="1")Integer pn,
			Model model) {
		//这不是一个分页查询
		//引入pagehelper分页插件
		//在查询之前只需要调用，传入页码，以及分页每一页的大小
		PageHelper.startPage(pn, 6);
		//startPage后面紧跟的查询就是分页查询
		List<Employee> emps=employeeService.getAll();
		
		//使用pageInfo包装查询后的结果，只需要将pageInfo交给页面就行了
		//封装了详细的分页信息，包括有我们查询出来的数据，传入连续显示的页数
		PageInfo page=new PageInfo(emps,5);
		model.addAttribute("pageInfo", page);
		
		return "list";
	}

}
