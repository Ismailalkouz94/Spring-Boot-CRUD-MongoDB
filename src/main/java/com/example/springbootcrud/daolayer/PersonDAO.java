package com.example.springbootcrud.daolayer;

import com.example.springbootcrud.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface PersonDAO extends MongoRepository<Person,Long> {

    public Person findPersonByEmailAndId(String email,Long id);
    public List<Person> findByEmailContains(String text);
    public int countAllBy();
    public Person findTopByName(String name);
    public Page<Person> findAll(Pageable pageable);
    public List<Person> findAll();
//    public List<Person> findByNameNQ(String name);
}
