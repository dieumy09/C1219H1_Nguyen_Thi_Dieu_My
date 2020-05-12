package com.codegym.webservice.service;

import com.codegym.webservice.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    List<Customer> findAll ();

    Optional<Customer> findById (Long id);

    Customer save(Customer customer);

    void delete(Customer customer);
}
