package com.springjdbc.App;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.springjdbc.JdbcConfig;
import com.springjdbc.dao.VehicleDao;
import com.springjdbc.entity.Vehicle;

public class CrudOperation {

	public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
	static VehicleDao dao;

	/* Insert Operation */

	@SuppressWarnings("resource")
	public static void insert() throws NumberFormatException, IOException {
		System.out.println("Program Started .... !\n");
		System.out.println("Enter No Of Wheel");
		int no = Integer.parseInt(br.readLine());
		System.out.println("Enter Vehicle Brand");
		String brand = br.readLine();
		System.out.println("Enter Vehicle name");
		String name = br.readLine();
		System.out.println("Enter Fuel Type");
		String fuel = br.readLine();

		Vehicle vehicle = new Vehicle();
		vehicle.setNoOfWheel(no);
		vehicle.setBrand(brand);
		vehicle.setName(name);
		vehicle.setFuel(fuel);
		int insert = dao.insert(vehicle);
		if (insert != 0) {
			System.out.println("Data Added successfully....!");
		} else {
			System.out.println("Data Added Failed .....!");
		}
	}

	/* Update Opertion */
	
	@SuppressWarnings("resource")
	public static void update() {
		try {
			System.out.println("Program Started .... !\n");
			System.out.println("Enter ID you can change");
			int id=Integer.parseInt(br.readLine());
			System.out.println("Enter No Of Wheel");
			int no = Integer.parseInt(br.readLine());
			System.out.println("Enter new Vehicle Brand");
			String brand = br.readLine();
			System.out.println("Enter new  Vehicle name");
			String name = br.readLine();
			System.out.println("Enter new Fuel Type");
			String fuel = br.readLine();
	
			Vehicle vehicle = new Vehicle();
			vehicle.setNoOfWheel(no);
			vehicle.setBrand(brand);
			vehicle.setName(name);
			vehicle.setFuel(fuel);
			vehicle.setId(id);
			int insert = dao.update(vehicle);
			if (insert != 0) {
				System.out.println("Data Updated successfully....!\n");
			} else {
				System.out.println("Data Updated Failed .....!\n");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/* Delete Operation */
	
	@SuppressWarnings("resource")
	public static void delete() throws NumberFormatException, IOException {

		System.out.println("Enter id You can delete");
		int id=Integer.parseInt(br.readLine());
		
		Vehicle vehicle=new Vehicle();
		int delete = dao.delete(id);
		if (delete != 0) {
			System.out.println("Data deleted successfully....!\n");
		} 
		else {
			System.out.println("Data deleted Failed .....!\n");
		}
		
	}

	/* Update Operation */
	
	public static void fetch() {
     
		List<Vehicle> fetch = dao.fetch();
		fetch.forEach(value ->{
			System.out.println(value);
		});
	    System.out.println("\nFetch Successfully .....!\n");
	}
	public static void getVehicle() throws NumberFormatException, IOException {
		System.out.println("Enter Your Id");
		int id=Integer.parseInt(br.readLine());
		Vehicle vehicle = dao.getVehicle(id);
		System.out.println(vehicle);
		System.out.println("\nFetch Successfully......!\n");
	}
					/* Menu */
	
	public static void menu() {
		br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("	   Choose Any Opetaion");
		System.out.println("1. Insert" + "			2.Update\n");
		System.out.println("3. Delete" + "			4.Fetch\n");
		System.out.println("5. Get Vehicle                  6.Exit");
		try {
			int choice = Integer.parseInt(br.readLine());
			
			switch (choice) {
				case 1:
					insert();
					menu();
				case 2:
					update();
					menu();
				case 3:
					delete();
					menu();
				case 4:
					fetch();
					menu();
				case 5:
					getVehicle();
					menu();
             default : 
			System.out.println("Thanks for visiting.....!");
			System.exit(choice);
		}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
		dao = context.getBean("vehicle",VehicleDao.class);
		menu();
	}
}
