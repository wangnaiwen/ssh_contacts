package com.contacts.service;

import com.contacts.dao.EmployeeDao;
import com.contacts.domain.Employee;

public class EmployeeServiceImp implements EmployeeService{

	private EmployeeDao employeeDao;

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public Employee login(Employee employee) {
		Employee existEmployee = employeeDao.findEmployeeByUsernameAndPassword(employee);
		return existEmployee;
	}
}
