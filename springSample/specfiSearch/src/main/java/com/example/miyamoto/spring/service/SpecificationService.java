package com.example.miyamoto.spring.service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.*;
import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.domain.Specification;

import com.example.miyamoto.spring.entity.Company;
import com.example.miyamoto.spring.entity.Member;


@Service
public class SpecificationService {
 
    /**
     *  あいまい検索
     * @param String searchTerm
     * @return Specification<member> Predicate
     */
    public static Specification<Member> FuzzySearch(String searchTerm) {
        // ラムダ式で記述すると、引数のデータ型の指定が省略できる
        return (root, query, cb) -> {
            String containsLikePattern = getContainsLikePattern(searchTerm);
            return cb.or(
                    cb.like(cb.lower(root.get("lastName")), containsLikePattern),
                    cb.like(cb.lower(root.get("firstName")), containsLikePattern),
                    cb.like(cb.lower(root.get("lastNameKana")), containsLikePattern),
                    cb.like(cb.lower(root.get("firstNameKana")), containsLikePattern),
                    cb.like(cb.lower(root.get("email")), containsLikePattern),
                    cb.like(cb.lower(root.get("tel")), containsLikePattern),
                    cb.like(cb.lower(root.get("addressLevel01")), containsLikePattern),
                    cb.like(cb.lower(root.get("addressLevel02")), containsLikePattern),
                    cb.like(cb.lower(root.get("addressLine01")), containsLikePattern),
                    cb.like(cb.lower(root.get("addressLine02")), containsLikePattern)
            );
        };
    }
 
    /**
     *  検索文字列が入力されたとき、されなかったときで調整
     * @param String searchTerm
     * @return String 調整された文字列
     */
    private static String getContainsLikePattern(String searchTerm) {
        if(searchTerm == null || searchTerm.isEmpty()) {
            return "%";
        } else {
            return "%" + searchTerm.toLowerCase() + "%";
        }
    }
    
    public static Specification<Company> CompanyNameEqual(String companyName) {
        return StringUtils.isEmpty(companyName) ? null : new Specification<Company>() {
            @Override
            public Predicate toPredicate(Root<Company> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return criteriaBuilder.equal(root.get("companyName"), companyName);
            }
        };
    }
 
}