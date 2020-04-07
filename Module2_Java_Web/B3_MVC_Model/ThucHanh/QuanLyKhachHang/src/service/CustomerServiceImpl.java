package service;

import model.Customer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CustomerServiceImpl implements CustomerService {
    private static Map<Integer, Customer> customerMap;
    static {
        customerMap = new HashMap<>();
        customerMap.put(1, new Customer(1,"Dieu My","my@gmail.com","Quang Nam"));
        customerMap.put(2, new Customer(2,"My Tinh","tinh@gmail.com","Da Nang"));
        customerMap.put(3, new Customer(3,"Huu Tho","tho@gmail.com","Quang Tri"));
        customerMap.put(4, new Customer(4, "Ha Nguyen", "nguyen@gmail.com","Da Nang"));
        customerMap.put(5, new Customer(5,"Van Thuan", "thuan@gmail.com","Da Nang"));
        customerMap.put(6, new Customer(6, "Huy Hoang","hoang@gmail.com","Da Nang"));
    }

    public List<Customer> findAll(){
        return new ArrayList<>(customerMap.values());
    }

    public void save(Customer customer){
        customerMap.put(customer.getId(), customer);
    }

    public Customer findById(int id){
        return customerMap.get(id);
    }

    public void update(int id, Customer customer){
        customerMap.put(id, customer);
    }

    public void remove(int id){
        customerMap.remove(id);
    }

}
