package com.example.springbootcrud.service.impl;

import com.example.springbootcrud.daolayer.PersonDAO;
import com.example.springbootcrud.entity.Person;
import com.example.springbootcrud.exception.CustomException;
import com.example.springbootcrud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    public Person findPersonByEmailAndId(String email, Long id) {
        try {
            return personDAO.findPersonByEmailAndId(email, id);
        }catch (Exception e){
            throw new CustomException(e.getMessage());
        }
    }

    @Override
    public List<Person> findByEmailContains(String text) {
        return personDAO.findByEmailContains(text);
    }

    @Override
    public int countAllBy() {
        return personDAO.countAllBy();
    }

    @Override
    public Person findTopByName(String name) {
        return personDAO.findTopByName(name);
    }

    @Override
    public List<Person> findAll() {
        return personDAO.findAll();
    }

    @Override
    public Page<Person> findAll(Pageable pageable) {
        return (Page<Person>) personDAO.findAll(pageable);
    }

    @Override
    public void delete(Person person) {
        personDAO.delete(person);
    }

    @Override
    public Person save(Person person) {
        return personDAO.save(person);
    }

//    @Override
//    public List<Person> findByNameNQ(String name) {
//        return personDAO.findByNameNQ(name);
//    }
}
