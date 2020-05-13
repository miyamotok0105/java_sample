package com.example.miyamoto.spring.service;

import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
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
 
}