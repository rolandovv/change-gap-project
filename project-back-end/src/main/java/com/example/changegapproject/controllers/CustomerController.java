package com.example.changegapproject.controllers;

import com.example.changegapproject.model.Customer;
import com.example.changegapproject.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    //Controllers are the end-points to access all data

    //Get customers
    @GetMapping(value ="/customers")
    public List<Customer> getCustomers(){
//        return contentService.getAllCategories();

        return  customerService.getCustomers();
    }

    //Get customer
    @GetMapping(value ="/customers/{customerId}")
    public Customer getCustomer(@PathVariable String customerId){

        return  customerService.getCustomer(customerId);
    }


    //Add a customer
    @PostMapping(value = "/create")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
}
