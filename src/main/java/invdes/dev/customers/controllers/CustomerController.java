package invdes.dev.customers.controllers;

import invdes.dev.customers.entitis.Customer;
import invdes.dev.customers.services.CustomerService;
import invdes.dev.customers.services.CustomerServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {


    @Autowired
    private CustomerService service;


    @GetMapping("/customer/{id}") //trae un cliente por id (especifico)
    public Customer getCustomer(@PathVariable Integer id) {

        return service.getCustomer(id);

    }

    @GetMapping("/customer") // trae todo los clientes
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @DeleteMapping("/customer/{id}") //Eliminar clientes
    public void removeCustomer(@PathVariable Integer id) {
        service.removeCustomer(id);

    }

    @PostMapping("/customer") //Agrega un cliente
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @PutMapping("/customer/{id}") //Actualizar clientes
    public void updateCustomer(@PathVariable Integer id, @RequestBody Customer updateCustomer) {
        service.updateCustomer(id, updateCustomer);

    }

    @GetMapping("/customer/search") //Buscar cliente por criterios(ejemplo por abecedario)
    public List<Customer> searchCustomer(@RequestParam(name = "email", required = false) String email,
                                         @RequestParam(name = "address", required = false) String address) {

        return service.searchCustomer(email, address);

    }

}

