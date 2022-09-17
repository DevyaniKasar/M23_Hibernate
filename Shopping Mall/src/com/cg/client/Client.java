package com.cg.client;


import com.cg.entities.Admin;
import com.cg.entities.Employee;
import com.cg.entities.Shop;
import com.cg.entities.User;
import com.cg.service.EmployeeService;
import com.cg.service.EmployeeServiceImpl;
import com.cg.service.ShopService;
import com.cg.service.ShopServiceImpl;
import com.cg.service.UserService;
import com.cg.service.UserServiceImpl;

public class Client 
{
	


	public static void main(String[] args) 
	{
		
		User user = new User();
		UserService userService = new UserServiceImpl();
		user.setUser_Id(111);
		user.setName("hariom");
		user.setType("System User");
		user.setPassword("1234");
		
		Admin admin = new Admin();
		admin.setAdmin_id(12);
		admin.setName("Devyani");
		admin.setPassword("4444");
		admin.setPhone("216835284");
		
		user.setAdmin(admin);
		admin.setUser(user);
		
		userService.addNewUser(user);
		
		
		
		
		Shop shop= new Shop();
		ShopService shopService = new ShopServiceImpl();
		shop.setShop_Id(12);
		shop.setShopCategory("Grocery");
		shop.setShopname("Ambika");
		shop.setShopstatus("Too Good");
		shop.setLeaseStatus("100");
		
		Employee employee = new Employee();
		EmployeeService employeeService = new EmployeeServiceImpl();
		employee.setEmp_id(1);
		employee.setName("Gaurav");
		employee.setLocalDate(12);
		employee.setSalary(30000);
		employee.setDesignation("Manager");
		
	    employeeService.updateEmployee(employee);
		shopService.updateShop(shop);
		
		
		
		
		
		System.out.println("Data Is Inserted");
		
		
	}

}
