package com.contacts.dao;

import com.contacts.domain.Employee;

public interface EmployeeDao {

	Employee findEmployeeByUsernameAndPassword(Employee employee);

}
