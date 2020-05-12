package com.codegym.webservice.controller;

import com.codegym.webservice.model.Customer;
import com.codegym.webservice.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping(value = "/customers/", method = RequestMethod.GET)
    public ResponseEntity<List<Customer>> listAllCustomers() {
        List<Customer> customers = customerService.findAll();
        if (customers.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(customers, HttpStatus.OK);
        }
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Customer> getCustomer(@PathVariable("id") Long id) {
        System.out.println("get get");
        Customer customer = customerService.findById(id).orElse(null);
        if (customer != null){
            return new ResponseEntity<>(customer,HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/customers/", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody Customer customer, UriComponentsBuilder ucBuilder) {
        customerService.save(customer);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/customers/{id}").buildAndExpand(customer.getId()).toUri());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }


    @RequestMapping(value = "/customers/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Customer> updateCustomer(@PathVariable("id") long id, @RequestBody Customer customer) {


        Customer currentCustomer = customerService.findById(id).orElse(null);

        if (currentCustomer == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        currentCustomer.setFirstName(customer.getFirstName());
        currentCustomer.setLastName(customer.getLastName());
        currentCustomer.setId(customer.getId());

        customerService.save(currentCustomer);
        return new ResponseEntity<>(currentCustomer, HttpStatus.OK);
    }

    @RequestMapping(value = "/customers/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Customer> deleteCustomer(@PathVariable("id") long id) {


        Customer customer = customerService.findById(id).orElse(null);
        if (customer == null) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        customerService.delete(customer);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
