package com.arrayOfSky.company.service;

import com.arrayOfSky.commom.service.BaseService;
import com.arrayOfSky.commom.utils.IdWorker;
import com.arrayOfSky.company.dao.DepartmentDao;
import com.arrayOfSky.domain.company.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

/**
 * @author GYF
 */
@Service
public class DepartmentService extends BaseService {

    @Autowired
    private DepartmentDao departmentDao;

    @Autowired
    private IdWorker idWorker;

    public void save(Department department){
        String id  = idWorker.nextId()+"";
        department.setId(id);
        departmentDao.save(department);
    }

    public void update(Department department){
        Department dept = departmentDao.findById(department.getId()).get();
        dept.setCode(department.getCode());
        dept.setIntroduce(department.getIntroduce());
        dept.setName(department.getName());
        departmentDao.save(dept);
    }

    public Department findById(String id){
        return departmentDao.findById(id).get();
    }

    public void deleteById(String id){
        departmentDao.deleteById(id);
    }

    public List<Department> findAll(String companyId){
        return departmentDao.findAll(getSpec(companyId));
    }






}
