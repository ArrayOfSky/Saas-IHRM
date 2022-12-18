package com.arrayOfSky.company.controller;

import com.arrayOfSky.commom.controller.BaseController;
import com.arrayOfSky.commom.entity.Result;
import com.arrayOfSky.commom.entity.ResultCode;
import com.arrayOfSky.company.service.CompanyService;
import com.arrayOfSky.domain.company.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/company")
public class CompanyController extends BaseController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Result save(@RequestBody Company company) {
        companyService.add(company);
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public Result update(@PathVariable(value = "id") String id,@RequestBody Company company){
        company.setId(id);
        companyService.update(company);
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public Result delete(@PathVariable(value = "id") String id){
        companyService.deleteById(id);
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Result findById(@PathVariable("id") String id){
        Company company = companyService.findById(id);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){
        List<Company> company = companyService.findAll();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(company);
        return result;
    }


}
