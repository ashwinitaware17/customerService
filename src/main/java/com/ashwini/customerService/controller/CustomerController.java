package com.ashwini.customerService.controller;

import java.io.ObjectOutputStream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwini.customerService.model.Customer;

@RestController
public class CustomerController {
	
	@GetMapping("/customer")
	public String getCustomers(){
		Customer customer = new Customer("1", "PAN", "hadapsar", "IN");
		return customer.toString();
	}
	
	
	@PostMapping("/customer")
	public String addCustomer(){
		Customer customer = new Customer("1", "PAN", "hadapsar", "IN");
		
		try{
			FileOutputStream fos=new FileOutputStream("D:\\customer.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(customer);
			oos.flush();
			System.out.println("success");
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
		
		
		return "";
		//Get the details of customer
		// add into the file
	}
	
	
	
	
//localhost:8080/customer
//	/loan
	
}
