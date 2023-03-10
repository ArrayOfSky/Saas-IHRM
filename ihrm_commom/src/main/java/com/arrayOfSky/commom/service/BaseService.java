package com.arrayOfSky.commom.service;

import com.arrayOfSky.domain.company.Department;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * @author GYF
 */
public class BaseService<T> {


    //需要通过companyId 来查询的时候
    protected Specification<T> getSpec(String companyId) {
        Specification<T> spec = new Specification() {
            @Override
            public Predicate toPredicate(Root root, CriteriaQuery criteriaQuery, CriteriaBuilder criteriaBuilder) {
                return  criteriaBuilder.equal(root.get("companyId").as(String.class),companyId);
            }
        };
    return spec;
    }


}
