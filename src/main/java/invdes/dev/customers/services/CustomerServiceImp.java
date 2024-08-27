package invdes.dev.customers.services;


import invdes.dev.customers.entitis.Customer;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerServiceImp implements CustomerService {


    private List<Customer> list = new ArrayList<>();

    public CustomerServiceImp() {

        Customer c = new Customer();

        c.setId(107);
        c.setFirstname("positive");
        c.setLastname("holi");
        c.setEmail("email@test.cl");
        c.setAddress("respira consiente 41");
        list.add(c);

        Customer c2 = new Customer();

        c2.setId(108);
        c2.setFirstname("positive");
        c2.setLastname("holi");
        c2.setEmail("email@test.cl");
        c2.setAddress("respira consiente 41");
        list.add(c2);

    }

    public Customer getCustomer(Integer id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;

    }

    public List<Customer> getAllCustomers() {
        return list;
    }

    public void removeCustomer(Integer id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                list.remove(customer);
                break;

            }
        }

    }

    public void addCustomer( Customer customer) {
        list.add(customer);
    }

    public void updateCustomer(Integer id, Customer updateCustomer) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                list.remove(customer);
                updateCustomer.setId(id);
                list.add(updateCustomer);
                break;
            }
        }

    }

    public List<Customer> searchCustomer(String email,
                                          String address) {

        List<Customer> searchResult = new ArrayList<>();

        if (email != null) {
            for (Customer customer : list) {
                if (customer.getEmail().contains(email)) {
                    searchResult.add(customer);
                }

            }
        }

        if (address != null) {

            for (Customer customer : list) {

                if (customer.getAddress().contains(address)) {
                    searchResult.add(customer);
                }
            }
        }
        return searchResult;
    }

}
