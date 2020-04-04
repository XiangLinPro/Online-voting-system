package com.xl.crud.test;

import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xl.crud.bean.Department;
import com.xl.crud.bean.Employee;
import com.xl.crud.dao.DepartmentMapper;
import com.xl.crud.dao.EmployeeMapper;

/**
 * 测试dao层工作
 * @author Administrator
 * 推荐spring的项目就可以使用SPring的单元测试，可以自动注入我们需要的组件
 * 1、导入SpringTest模块
 * 2、@ContextConfiguration指定配置文件的位置
 * 3、直接autowired要使用的组件即可
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSession sqlSession;
	/**
	 * 测试departmentMapper
	 */
	@Test
	public void testCRUD() {
//		//1.创建SpringIOC容器
//		ApplicationContext ioc=new ClassPathXmlApplicationContext("applicationContext.xml");
//		//从容器中获取mapper
//		DepartmentMapper bean=ioc.getBean(DepartmentMapper.class);
		System.out.println(departmentMapper);
		
		//1.插入几个部门
//		new Department();
//		departmentMapper.insertSelective(new Department(1,"看电影"));
//		departmentMapper.insertSelective(new Department(2,"唱歌"));
		
		//2、生成员工数据，测试员工插入
		//employeeMapper.insertSelective(new Employee(null, "jerry", "F", "jerry@xl.com", 1));
		//3.批量插入多个员工,批量，使用可以执行批量操作的sqlsession
//		for() {
//			employeeMapper.insertSelective(new Employee(null, "jerry", "F", "jerry@xl.com", 1));
//		}
		EmployeeMapper mapper=sqlSession.getMapper(EmployeeMapper.class);
		for(int i=0;i<1000;i++) {
			String uid=UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Employee(null, uid, "M", uid+"@xl.com", 1));
			
		}
		System.out.println("批量完成");
//		
	}

}
