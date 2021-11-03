package de4.webtech.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import de4.webtech.web.api.Person;

@RestController
public class PersonRestController {

    private List<Person> persons;

    public PersonRestController(){
        persons = new ArrayList<>();
        persons.add(new Person(1, "Bruce", "Willis", true));
        persons.add(new Person(2, "John", "McClane", true));
        persons.add(new Person(3, "Hans", "Gruber", false));

    }

    @GetMapping(path = "/api/v1/persons")
    @ResponseStatus(code = HttpStatus.OK)
    public List<Person> fetchPersons() {
        return persons;
    }
    
}
