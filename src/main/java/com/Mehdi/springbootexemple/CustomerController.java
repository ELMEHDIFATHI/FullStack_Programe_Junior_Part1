package com.Mehdi.springbootexemple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    private  CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/api/v1/Customer")
    public List<Customer> listCutomers(){
        return customerService.getCustomer();
    }

    @GetMapping("/api/v1/Customer/{CustomerId}")
    public Customer getCustomerById(@PathVariable("CustomerId") Integer CustomerId){
        return customerService.getCustomerById(CustomerId);


    }
}
