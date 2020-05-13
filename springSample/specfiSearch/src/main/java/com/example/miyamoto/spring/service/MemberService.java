package com.example.miyamoto.spring.service;

import java.util.List;
 
import org.springframework.data.jpa.domain.Specification;
//import org.springframework.data.jpa.domain.Specifications;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.miyamoto.spring.entity.Member;
import com.example.miyamoto.spring.repository.MemberRepository;
import static com.example.miyamoto.spring.service.SpecificationService.*; 
 
@Service
public class MemberService {
 
    @Autowired
    MemberRepository repository;
 
    public List<Member> findMembers(String target) {
        return this.repository.findAll(Specification
                .where(FuzzySearch(target)));
    }
}