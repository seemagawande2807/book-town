package com.example.booktown.service;

import com.example.booktown.entity.Customer;

import java.util.List;

public interface CustomerService {
    public List<Customer> getAllCustomer();

     Customer save(Customer customer);

    boolean updateCustomer(Customer customer, int customerId);

}

