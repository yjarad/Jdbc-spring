package com.edu.yog.boot.jdbc.dao;

import com.edu.yog.boot.jdbc.model.Employee;

public interface EmployeeDao {

	void insertEmployee(Employee cus);

	void deleteEmployeeById(String empid);
}
