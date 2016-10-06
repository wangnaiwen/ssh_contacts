package com.contacts.action;

import com.contacts.domain.Employee;
import com.contacts.service.EmployeeService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class EmployeeAction extends ActionSupport implements ModelDriven<Employee>{
	
	//ģ������ʹ�õĶ���
	private Employee employee = new Employee();
	
	public Employee getModel() {
		return employee;
	}
	
	/**
	 * ע��ҵ���߼������
	 * */
	private EmployeeService employeeService;
	
	
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


	/**
	 * ��¼ִ�еķ���
	 * */
	public String login(){
		System.out.print("Login ����ִ���ˡ�������������:"+employee.getUsername()+employee.getPassword());
		Employee existEmployee = employeeService.login(employee);
		if(existEmployee == null){
			this.addActionError("�û��������������");
			System.out.print("�Ҳ����Ҳ����Ҳ�����");
			return INPUT;
		}else{
			ActionContext.getContext().getSession().put("existEmployee", existEmployee);
			System.out.println("�ҵ����ҵ���"+existEmployee.getEname()+existEmployee.getPassword());
			return SUCCESS;
		}
	}
}
