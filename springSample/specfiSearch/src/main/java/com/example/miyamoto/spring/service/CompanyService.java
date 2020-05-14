package com.example.miyamoto.spring.service;

import java.util.List;
 
import org.springframework.data.jpa.domain.Specification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miyamoto.spring.entity.Company;
import com.example.miyamoto.spring.repository.CompanyRepository;
import static com.example.miyamoto.spring.service.SpecificationService.*; 
 
@Service
public class CompanyService {
 
    @Autowired
    CompanyRepository repository;
 
    public List<Company> findCompanys(String target) {
    	//
        return this.repository.findAll(Specification
                .where(CompanyNameEqual(target)));
    }
    
    public List<Company> findAll() {
    	//
        return this.repository.findAll();
    }
}