package invdes.dev.customers.services;


import invdes.dev.customers.entitis.Customer;

import java.util.List;

public interface CustomerService {

    Customer getCustomer(Integer id);
    List<Customer> getAllCustomers();
    void removeCustomer(Integer id);
    void updateCustomer(Integer id, Customer updateCustomer);
    List<Customer> searchCustomer(String email, String address);
    void addCustomer(Customer customer);
}
