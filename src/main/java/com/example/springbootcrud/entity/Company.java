package com.example.springbootcrud.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Document(collection = "company")
public class Company {
    @Id
    private String id;

    @NotBlank
    @Indexed(unique = true)
    private String name;

    private List<Person> person;

    public Company( @NotBlank String name, List<Person> person) {
        this.name = name;
        this.person = person;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Company{" +
                "aLong=" + id +
                ", name='" + name + '\'' +
                ", person=" + person +
                '}';
    }
}
