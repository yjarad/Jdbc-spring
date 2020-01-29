package com.edu.yog.boot.jdbc.service;

import com.edu.yog.boot.jdbc.dao.EmployeeHealthInsurance;
import com.edu.yog.boot.jdbc.model.Employee;

public interface OrganizationService {
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);


}
