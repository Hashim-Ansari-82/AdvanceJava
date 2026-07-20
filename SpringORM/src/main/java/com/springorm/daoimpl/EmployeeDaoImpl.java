package com.springorm.daoimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.springorm.dao.EmployeeDao;
import com.springorm.entity.Employee;

import lombok.Data;

@Data
public class EmployeeDaoImpl implements EmployeeDao{

	private HibernateTemplate template;

	@Transactional
	@Override
	public int insert(Employee employee) {
		Integer save = (Integer)template.save(employee);
		return save;
	}

	@Transactional
	@Override
	public void update(Employee employee) {
		this.template.update(employee);
	}

	@Transactional
	@Override
	public void delete(int employeeId) {
		Employee employee = template.get(Employee.class, employeeId);
		this.template.delete(employee);
	}

	@Override
	public List<Employee> fetch() {
		List<Employee> loadAll = template.loadAll(Employee.class);
		return loadAll;
	}

	@Override
	public Employee getEmployee(int employeeId) {
		Employee employee = template.get(Employee.class, employeeId);
		return employee;
	}
	
}
