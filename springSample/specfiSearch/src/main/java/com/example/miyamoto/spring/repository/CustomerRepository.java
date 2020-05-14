package com.example.miyamoto.spring.repository;

import com.example.miyamoto.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{
}
