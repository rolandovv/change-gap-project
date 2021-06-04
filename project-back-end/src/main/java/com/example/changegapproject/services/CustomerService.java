package com.example.changegapproject.services;

import com.example.changegapproject.model.Customer;
import com.example.changegapproject.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    //Get all customers .
    public List<Customer> getCustomers() {

        return customerRepository.findAll();
    }

    //Get a singe customer .
    public Customer getCustomer(String customerId) {

        return customerRepository.findById(customerId).get();
    }

    //Add a customer
    public void createCustomer(Customer customer){

        customerRepository.save(customer);
    }


}
