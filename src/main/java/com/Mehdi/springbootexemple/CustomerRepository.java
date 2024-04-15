package com.Mehdi.springbootexemple;

import java.util.List;
import java.util.Optional;


public interface CustomerRepository  {

    public List<Customer> getCustomer();
    public Optional<Customer> getCustomerById(Integer id);
}
