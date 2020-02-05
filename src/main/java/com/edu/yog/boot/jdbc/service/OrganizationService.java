package com.edu.yog.boot.jdbc.service;

import com.edu.yog.boot.jdbc.model.Employee;
import com.edu.yog.boot.jdbc.model.EmployeeHealthInsurance;

public interface OrganizationService {
	public void joinOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);
	public void leaveOrganization(Employee employee, EmployeeHealthInsurance employeeHealthInsurance);


}
