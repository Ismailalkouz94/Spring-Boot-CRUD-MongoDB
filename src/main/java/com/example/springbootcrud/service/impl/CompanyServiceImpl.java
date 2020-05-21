package com.example.springbootcrud.service.impl;

import com.example.springbootcrud.daolayer.CompanyDAO;
import com.example.springbootcrud.entity.Company;
import com.example.springbootcrud.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyDAO companyDAO;

    @Override
    public void add(Company company) {
        companyDAO.save(company);
    }

    @Override
    public void edit(Company company) {
       companyDAO.save(company);
    }

    @Override
    public void delete(Company company) {
        companyDAO.delete(company);
    }

    @Override
    public Company findById(Long id) {
        return companyDAO.findById(id).get();
    }

    @Override
    public Company findByName(String name) {
        return companyDAO.findByName(name).get();
    }

    @Override
    public List<Company> find() {
        return companyDAO.findAll();
    }
}
