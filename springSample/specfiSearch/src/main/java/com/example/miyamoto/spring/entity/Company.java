package com.example.miyamoto.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.*;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="company")
public class Company implements Serializable {
 
    @Id
    @GeneratedValue
    @Column(name="company_id")
    private Integer companyId;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @OneToMany
    @JoinColumn(name = "company_id", referencedColumnName = "company_id")
    private List<Customer> customers;
}
