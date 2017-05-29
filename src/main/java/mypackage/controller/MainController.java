package mypackage.controller;

/**
 * Created by f on 28.05.17.
 */

import mypackage.entities.Person;
import mypackage.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/myservice")

public class MainController {
    @Autowired
    PersonService persons;

    @RequestMapping(value = "/{id}")
    public Person getSingle(@PathVariable Long id) {
        return persons.findById(id);
    }

    @RequestMapping(value = "/list")
    public List<Person> getList() {
        return persons.listAll();
    }

    @RequestMapping("/greeting")
    public Person greeting(@RequestParam(value="name", required=false, defaultValue="Vax") String name) {
    return new Person(0, name, (short) 45);
    }
    }
