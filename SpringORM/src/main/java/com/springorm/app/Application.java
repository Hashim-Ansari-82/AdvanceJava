package com.springorm.app;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorm.dao.EmployeeDao;
import com.springorm.entity.Employee;

public class Application {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int choice;
	static EmployeeDao bean;

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		System.out.println("<-------- Program Started Successfully -------->\n");
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springorm/config.xml");
		bean = context.getBean("employeeDao", EmployeeDao.class);

		do {
			System.out.println("\n<-------- Press Button You can perfom Operation -------->\n");
			System.out.println("Press 1 for add new Employee   Press 2 for display All Employee\n");
			System.out.println("Press 3 for Single Employee    Press 4 for delete Employee\n");
			System.out.println("Press 5 for update Employee    Press 6 for Exit\n");
			try {
				choice = Integer.parseInt(br.readLine());
				switch (choice) {
				case 1:
					insert();
					break;
				case 2:
					fetch();
					break;
				case 3:
					getEmployee();
					break;
				case 4:
					delete();
					break;
				case 5:
					update();
					break;
				default:
					System.out.println("<-------- Thanks for visiting -------->");
					System.exit(choice);
				}
			} catch (Exception e) {
				System.out.println("\n<-------- Something went wrong -------->\n"+e);
			}

		} while (choice < 6);

	}
 
	private static void insert() {
		try {
		System.out.println("Enter Employee Id");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Salary");
		double salary = Double.parseDouble(br.readLine());
		System.out.println("Enter Employee Name");
		String name = br.readLine();
		System.out.println("Enter Employee Age");
		int age = Integer.parseInt(br.readLine());
		System.out.println("Enter Employee Address");
		String address = br.readLine();
		

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeSalary(salary);
		employee.setEmployeeName(name);
		employee.setEmployeeAge(age);
		employee.setEmployeeAddress(address);
		int insert = bean.insert(employee);
		if(insert > 0) {
			System.out.println("\n<-------- Inserted successfully -------->\n");
		}
		else
		{
			System.out.println("\n<-------- Inserted Failed -------->\n");
		}
		}
		catch(Exception e) {
			System.out.println("\n<-------- Something went wrong -------->\n"+e);
		}
		
	}

	private static void fetch() {
       List<Employee> fetch = bean.fetch();
       System.out.println("                                  Employee List Here ");
       fetch.forEach(list ->{
    	   System.out.println("_______________________________________________________________________________________________________________________\n");
    	   System.out.println(list);
       });
       System.out.println("_______________________________________________________________________________________________________________________");
	}
	private static void getEmployee() {
		try {
		System.out.println("\n<-------- Enter Employee Id you can show detail -------->");
		int id = Integer.parseInt(br.readLine());
		 
        Employee employee = bean.getEmployee(id);
        System.out.println("\n                                Single Employee detail is Here ");
        System.out.println("_______________________________________________________________________________________________________________________\n");
        System.out.println(employee);
        System.out.println("_______________________________________________________________________________________________________________________");
		}
		catch (Exception e) {
			System.out.println("\n<-------- Something went wrong -------->\n"+e);
		}
	}
	private static void delete() {
		try {
		System.out.println("\n<-------- Enter Employee Id you can delete -------->");
		int id = Integer.parseInt(br.readLine());
        bean.delete(id);
        System.out.println("\n<-------- You are Faired -------->\n");
		}
		catch(Exception e) {
			System.out.println("\n<-------- Faired Failed -------->\n"+e);
		}
	}
	private static void update() {
		try {
			System.out.println("Enter Employee Id You can Change");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee Salary");
			double salary = Double.parseDouble(br.readLine());

			Employee employee = new Employee();
			employee.setEmployeeId(id);
			employee.setEmployeeSalary(salary);
			
			bean.update(employee);
			if(employee != null) {
				System.out.println("\n<-------- Updated successfully -------->\n");
			  }
			}
			catch(Exception e) {
				System.out.println("\n<-------- Something went wrong -------->\n"+e);
			}
	}

}
