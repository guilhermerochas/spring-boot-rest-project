package com.github.guilhermerochas.demorestapi.Controller;

import com.github.guilhermerochas.demorestapi.Model.Person;
import com.github.guilhermerochas.demorestapi.Repository.PersonRepository;
import com.github.guilhermerochas.demorestapi.Services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("person")
public class PersonController {

    @Autowired
    PersonService personService;

    @GetMapping(value = "/")
    public Iterable<Person> GetAll(){
        return personService.getAllPeople();
    }
}
