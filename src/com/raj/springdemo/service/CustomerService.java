package com.raj.springdemo.service;

import java.util.List;

import com.raj.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();

	public void save(Customer theCustomer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);

}
