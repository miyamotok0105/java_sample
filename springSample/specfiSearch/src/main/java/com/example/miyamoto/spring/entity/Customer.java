package com.example.miyamoto.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_code", nullable = false)
    private String customerCode;

    @Column(name ="company_id", nullable = false)
    private Integer companyId;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;
}
