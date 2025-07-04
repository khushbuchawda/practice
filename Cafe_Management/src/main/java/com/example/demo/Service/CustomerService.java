package com.example.demo.Service;

import com.example.demo.Model.Customer;

public class CustomerService {
	
public void addCustomerInDb(Customer c)
{
	System.out.println("Customer is added Sucessfully");
}

public Customer getDataFromDb()
{
	Customer customer = new Customer();
	customer.setCustomerId(101);
	customer.setFirstName("Khushbu");
	customer.setLastName("Chawda");
	customer.setPhoneNumber("7666234201");
	customer.setEmail("khushbu@example.com");
	customer.setAddress("Pune, Maharashtra");
	return customer;
}

}
