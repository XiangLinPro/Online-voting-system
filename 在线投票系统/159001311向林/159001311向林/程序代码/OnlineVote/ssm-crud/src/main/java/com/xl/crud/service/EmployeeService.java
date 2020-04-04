package com.xl.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xl.crud.bean.Department;
import com.xl.crud.bean.Employee;
import com.xl.crud.bean.EmployeeExample;
import com.xl.crud.bean.EmployeeExample.Criteria;
import com.xl.crud.dao.EmployeeMapper;

@Service//业务逻辑主键
public class EmployeeService {
	//自动装配services层业务逻辑主键
	@Autowired
	EmployeeMapper employeeMapper;

	/**
	 * 查询所有员工
	 * @return
	 */
	public List<Employee> getAll() {
		//查所有
		return employeeMapper.selectByExampleWithDept(null);
	}
	/**
	 * 员工保存
	 * @param employee
	 */

	public void saveEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.insertSelective(employee);
		
	}
	/**
	 * 检验用户名是否可用
	 * @param empName
	 * @return true；代表当前姓名可用 false；不可用
	 */
	public boolean checkuser(String empName) {
		// TODO Auto-generated method stub
		EmployeeExample example=new EmployeeExample();
		Criteria criteria=example.createCriteria();
		criteria.andEmpNameEqualTo(empName);
		long count=employeeMapper.countByExample(example);
		return count==0;
	}
	/**
	 * 按照选手id查询选手
	 * @param id
	 * @return
	 */
	public Employee getEmp(Integer id) {
		// TODO Auto-generated method stub
		Employee employee=employeeMapper.selectByPrimaryKey(id);
		
		return employee;
	}
	/**
	 * 选手更新
	 * @param employee
	 */
	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeMapper.updateByPrimaryKeySelective(employee);
		
	}
	/**
	 * 选手删除
	 * @param id
	 */
	public void deleteEmp(Integer id) {
		// TODO Auto-generated method stub
		employeeMapper.deleteByPrimaryKey(id);
		
	}
	public void deleteBatch(List<Integer> ids) {
		// TODO Auto-generated method stub
		EmployeeExample example=new EmployeeExample();
		Criteria criteria=example.createCriteria();
		//delete form xxx where emp_id in(1,2,3)
		criteria.andEmpIdIn(ids);
		employeeMapper.deleteByExample(example);
		
	}
	
	/**
	 * 获取所有选手方法
	 * @return
	 */
	public List<Employee> getEmps() {
		// TODO Auto-generated method stub
		List<Employee> list=employeeMapper.selectByExample(null);
		return list;
		
	}
	/*public List<Department> getDepts() {
		// TODO Auto-generated method stub
		List<Department> list=departmentMapper.selectByExample(null);
		return list;
	}*/

}
