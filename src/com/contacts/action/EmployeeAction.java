package com.contacts.action;

import com.contacts.domain.Employee;
import com.contacts.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	
	//模型驱动使用的对象
	private Employee employee = new Employee();
	
	public Employee getModel() {
		return employee;
	}
	
	/**
	 * 注入业务逻辑层的类
	 * */
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	/**
	 * 登录执行的方法
	 * */
	public String login(){
		System.out.print("Login 方法执行了。。。。。。。:"+employee.getUsername()+employee.getPassword());
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null){
			this.addActionError("用户名或者密码错误！");
			System.out.print("找不到找不到找不到！");
			return INPUT;
		}else{
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			System.out.println("找到了找到了"+existEmployee.getEname()+existEmployee.getPassword());
			return SUCCESS;
		}
	}
}
