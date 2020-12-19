package com.github.guilhermerochas.demorestapi.Repository;

import com.github.guilhermerochas.demorestapi.Model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {}