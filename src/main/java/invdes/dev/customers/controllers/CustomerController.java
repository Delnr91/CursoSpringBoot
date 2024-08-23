package invdes.dev.customers.controllers;

import invdes.dev.customers.entitis.Customer;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController

public class CustomerController {

    private List<Customer> list = new ArrayList<>();

    public CustomerController() {

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

    @GetMapping("/customer/{id}") //trae un cliente por id (especifico)
    public Customer getCustomer(@PathVariable Integer id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;

    }

    @GetMapping("/customer") // trae todo los clientes
    public List<Customer> getAllCustomers() {
        return list;
    }

    @DeleteMapping("/customer/{id}") //Eliminar clientes
    public void removeCustomer(@PathVariable Integer id) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                list.remove(customer);
                break;

            }
        }

    }

    @PostMapping("/customer") //Agrega un cliente
    public void addCustomer(@RequestBody Customer customer) {
        list.add(customer);
    }

    @PutMapping("/customer/{id}") //Actualizar clientes
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer updateCustomer) {
        for (Customer customer : list) {
            if (customer.getId() == id) {
                list.remove(customer);
                updateCustomer.setId(id);
                list.add(updateCustomer);
                break;
            }
        }

    }

    @GetMapping("/customer/search") //Buscar cliente por criterios(ejemplo por abecedario)
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String email,
                                         @RequestParam(name = "address", required = false) String address) {
        List<Customer> searchResult = new ArrayList<>();

        for (Customer customer : list) {
            if (customer.getEmail().contains(email) || customer.getAddress().contains(address)) {
                searchResult.add(customer);
            }

        }
        return searchResult;
    }

}

