package com.javatechie.azure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication()
@RestController
public class SpringbootAzureSqlserverApplication {


    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return null;
    }

    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootAzureSqlserverApplication.class, args);
    }

}
