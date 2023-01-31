package com.arrayOfSky.company.controller;

import com.arrayOfSky.commom.controller.BaseController;
import com.arrayOfSky.commom.entity.Result;
import com.arrayOfSky.commom.entity.ResultCode;
import com.arrayOfSky.company.service.CompanyService;
import com.arrayOfSky.company.service.DepartmentService;
import com.arrayOfSky.domain.company.Company;
import com.arrayOfSky.domain.company.Department;
import com.arrayOfSky.domain.company.response.DeptListResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author GYF
 */
@RestController
@CrossOrigin
@RequestMapping(value = "/company")
public class DepartmentController extends BaseController {

    @Autowired
    private DepartmentService departmentService;

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/department",method = RequestMethod.POST)
    public Result save(@RequestBody Department department){
        department.setCompanyId(companyId);
        departmentService.save(department);
        return new Result(ResultCode.SUCCESS);
    }


    @RequestMapping(value = "/department",method = RequestMethod.GET)
    public Result findAll(){
        Company company = companyService.findById(companyId);
        List<Department> list = departmentService.findAll(companyId);
        DeptListResult deptListResult = new DeptListResult(company,list);
        return new Result(ResultCode.SUCCESS,deptListResult);
    }

    @RequestMapping(value = "/department/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id){
        Department department = departmentService.findById(id);
        return new Result(ResultCode.SUCCESS,department);
    }

    @RequestMapping(value = "/department/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable("id") String id,@RequestBody Department department){
        department.setId(id);
        departmentService.update(department);
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/department/{id}",method = RequestMethod.DELETE)
    public Result deleteById(@PathVariable("id") String id){
        departmentService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }


    @RequestMapping(value="/department/search",method = RequestMethod.POST)
    public Department findByCode(@RequestParam(value="code") String code,@RequestParam(value="companyId") String companyId) {
        Department dept = departmentService.findByCode(code,companyId);
        return dept;
    }





}
