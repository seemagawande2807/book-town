package com.example.booktown.serviceImpl;

import com.example.booktown.dao.CustomerRepository;
import com.example.booktown.entity.Customer;
import com.example.booktown.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

 public CustomerServiceImpl(CustomerRepository customerRepository) {
      this.customerRepository = customerRepository;
   }

    @Override
    public List<Customer> getAllCustomer() {
        return null;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public boolean updateCustomer(Customer customer, int customerId) {
        return false;
    }
}
