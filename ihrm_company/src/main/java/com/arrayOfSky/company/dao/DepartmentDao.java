package com.arrayOfSky.company.dao;

import com.arrayOfSky.domain.company.Company;
import com.arrayOfSky.domain.company.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author GYF
 */
public interface DepartmentDao extends JpaRepository<Department,String>, JpaSpecificationExecutor<Department> {

    Department findByCodeAndCompanyId(String code, String companyId);

}
