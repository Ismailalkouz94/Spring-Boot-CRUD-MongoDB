package com.example.springbootcrud.service;

import com.example.springbootcrud.entity.Company;

import java.util.List;

public interface CompanyService {
    void add(Company company);
    void edit(Company company);
    void delete(Company company);
    Company findById(Long id);
    Company findByName(String id);
    List<Company> find();
}
