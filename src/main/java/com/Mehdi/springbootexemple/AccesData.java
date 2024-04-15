package com.Mehdi.springbootexemple;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class AccesData implements CustomerRepository {

    private static List<Customer> customers;

    static {
        customers = new ArrayList<>();
        Customer c1 = new Customer(1, "Mehdi", "mehdiblabo@gmail.com", 23);
        customers.add(c1);
        Customer c2 = new Customer(2, "Ayoub", "mehdiblabo@gmail.com", 19);
        customers.add(c2);

    }

    @Override
    public List<Customer> getCustomer() {
        return customers;
    }

    @Override
    public Optional<Customer> getCustomerById(Integer id) {
        return customers.stream()
                .filter(customer -> customer.getId().equals(id))
                .findFirst()
                ;
    }
}
