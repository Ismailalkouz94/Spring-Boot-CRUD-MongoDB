package com.example.springbootcrud.daolayer;

import com.example.springbootcrud.entity.Company;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface CompanyDAO extends MongoRepository<Company,Long> {
    Optional<Company> findByName(String name);
}
