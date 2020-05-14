
package com.example.miyamoto.spring.repository;

import org.springframework.stereotype.Repository;

import com.example.miyamoto.spring.entity.Company;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer>, JpaSpecificationExecutor<Company> {
 
}

