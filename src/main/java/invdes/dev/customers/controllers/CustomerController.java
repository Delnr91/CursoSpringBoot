package invdes.dev.customers.controllers;


import invdes.dev.customers.entitis.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController

public class CustomerController {


    @GetMapping("/prueba")
    public String prueba (){

        return "Test";
    }
    @GetMapping("/prueba2")
    public List<String> prueba2 (){
        List<String> list = new ArrayList<>();
        list.add("hola");
        list.add("positivo");
        list.add("respira");
        return list ;
    }
    @GetMapping("/prueba3")
    public Map<String, String> prueba3 (){
        Map<String, String> map = new HashMap();
        map.put("holi", "buen dia");
        map.put("holis", "buen dias");
        map.put("holisss", "buen diass");
        map.put("holissss", "buen diasss");
        return map ;
    }

    @GetMapping("/prueba4")
    public Customer prueba4(){
        Customer c = new Customer();
        c.setFirstname("positive");
        c.setLastname("holi");
        c.setEmail("email@test.cl");
        c.setAddress("respira consiente 41");

        return c;
    }

}

