package com.example.booktown.dao;

import com.example.booktown.entity.Customer;

public interface JpaRepository<T, T1> {
    Customer create(Customer customer);

}
