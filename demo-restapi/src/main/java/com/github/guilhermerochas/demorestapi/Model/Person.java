package com.github.guilhermerochas.demorestapi.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "people")
public class Person {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @Column(name = "name")
    private String name;

    public Person() {}

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
