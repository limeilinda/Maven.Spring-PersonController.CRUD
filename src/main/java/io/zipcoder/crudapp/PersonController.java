package io.zipcoder.crudapp;

import org.apache.catalina.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PersonController {

    private Service service;

    @Autowired
    public PersonController(Service service) {
        this.service = service;
    }

    Person createPerson(Person p) {
        return null;
    }

    @GetMapping("/{id}")
    Person getPerson(@PathVariable int id) {
        return null;
    }

    List<Person> getPersonList() {
        return null;
    }

    Person updatePerson(@RequestBody Person p) {
        return p;
    }

    @DeleteMapping("/{id}")
    void DeletePerson(@PathVariable int id) {

    }
}
