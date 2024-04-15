package com.Mehdi.springbootexemple;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerService {

    private AccesData accesData;


    public CustomerService(AccesData accesData) {
        this.accesData = accesData;
    }

    public List<Customer> getCustomer() {
        return accesData.getCustomer();
    }

    public Customer getCustomerById(Integer CustomerId) {
        return accesData.getCustomerById(CustomerId).orElseThrow(() -> new IllegalArgumentException("This ID does not exist"));
    }
}
