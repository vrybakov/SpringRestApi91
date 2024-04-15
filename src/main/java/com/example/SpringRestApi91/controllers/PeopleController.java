package com.example.SpringRestApi91.controllers;

import com.example.SpringRestApi91.models.Person;
import com.example.SpringRestApi91.services.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/people")
public class PeopleController {

    private final PeopleService peopleService;

    @Autowired
    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping()
    public List<Person> findAll() {
        return peopleService.findAll();
    }

    @GetMapping("/{id}")
    public Person findOne(@PathVariable("id") int id) {
        return peopleService.findOne(id);
    }
}
