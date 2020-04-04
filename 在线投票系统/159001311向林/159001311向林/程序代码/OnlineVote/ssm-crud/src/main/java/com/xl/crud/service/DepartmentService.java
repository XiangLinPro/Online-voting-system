package com.xl.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.crud.bean.Department;
import com.xl.crud.dao.DepartmentMapper;

@Service//ÒµÎñÂß¼­Ö÷¼ü
public class DepartmentService {
	
	@Autowired
	private DepartmentMapper departmentMapper;

	public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list=departmentMapper.selectByExample(null);
		return list;
	}

}
