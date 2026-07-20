package com.springcore.configclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcore.configentity.Employee;
import com.springcore.configentity.Student;

public class EmployeeClass 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Employee emp = context.getBean("emp",Employee.class);
        emp.emp();
    }
}
