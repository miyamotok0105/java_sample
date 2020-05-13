package com.example.miyamoto.spring.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="member")
public class Member implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", nullable=false)
    private Integer id;
 
    @Column(name="last_name", nullable=false)
    private String lastName;
 
    @Column(name="first_name", nullable=false)
    private String firstName;
 
    @Column(name="last_name_kana", nullable=false)
    private String lastNameKana;
 
    @Column(name="first_name_kana", nullable=false)
    private String firstNameKana;
 
    @Column(name="email", nullable=false)
    private String email;
 
    @Column(name="tel", nullable=false)
    private String tel;
 
    @Column(name="address_level01", nullable=false)
    private String addressLevel01;
 
    @Column(name="address_level02", nullable=false)
    private String addressLevel02;
 
    @Column(name="address_line01", nullable=false)
    private String addressLine01;
 
    @Column(name="address_line02", nullable=false)
    private String addressLine02;
}
