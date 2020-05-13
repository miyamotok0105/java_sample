package com.example.miyamoto.spring.repository;

import org.springframework.stereotype.Repository;

import com.example.miyamoto.spring.entity.Member;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

 
@Repository
public interface MemberRepository extends JpaRepository<Member, Integer>, JpaSpecificationExecutor<Member> {
 
}

