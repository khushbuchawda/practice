package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Customer;
import com.example.demo.Service.CustomerService;

@RestController
public class CustomerController 
{
	CustomerService cs=new CustomerService();
	
	@PostMapping("addcustomer")
	String addCustomer(@RequestBody Customer c)
	{
		
		cs.addCustomerInDb(c);
		System.out.println("Customer is Added");
		return "Customer is added";
	}
	
	@GetMapping("/getCustomer")
	Customer getCustomerFromDb()
	{
		Customer cc=cs.getDataFromDb();
		return cc;
	}

}
