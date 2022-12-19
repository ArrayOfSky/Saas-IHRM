package com.arrayOfSky.commom.controller;

import org.springframework.web.bind.annotation.ModelAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author GYF
 */
public class BaseController {

    protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected String companyId;
    protected String companyName;

    /**
     * 每个controller执行之前都会执行
     * @param request
     * @param response
     */
    @ModelAttribute
    public void setResAnReq(HttpServletRequest request,HttpServletResponse response){
        this.request = request;
        this.response = response;

        //先默认设置
        this.companyId = "1";
        this.companyName = "gyf";

    }


}
