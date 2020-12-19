package com.github.guilhermerochas.demorestapi.Services;

import com.github.guilhermerochas.demorestapi.Model.Person;
import com.github.guilhermerochas.demorestapi.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public Iterable<Person> getAllPeople() {
        return repository.findAll();
    }
}
