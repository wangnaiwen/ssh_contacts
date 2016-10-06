package com.contacts.dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.contacts.domain.Employee;

public class EmployeeDaoImp extends HibernateDaoSupport implements EmployeeDao{

	public Employee findEmployeeByUsernameAndPassword(Employee employee) {
		String hql = "from Employee where username = ? and password = ?";
		List<Employee> employees = this.getHibernateTemplate().find(hql, employee.getUsername(), employee.getPassword());
		if(employees.size() != 0){
			return employees.get(0);
		}
		return null;
	}

}
