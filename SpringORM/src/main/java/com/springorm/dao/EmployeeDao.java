package com.springorm.dao;

import java.util.List;

import com.springorm.entity.Employee;

public interface EmployeeDao {

	public int insert(Employee employee);
	public void update(Employee employee);
	public void delete(int employeeId);
	public List<Employee> fetch();
	public Employee getEmployee(int employeeId);
}
