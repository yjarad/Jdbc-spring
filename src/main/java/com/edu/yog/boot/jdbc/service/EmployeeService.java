package com.edu.yog.boot.jdbc.service;

import com.edu.yog.boot.jdbc.model.Employee;

public interface EmployeeService {
	
	void insertEmployee(Employee emp);
	void deleteEmployeeById(String empid);

}
