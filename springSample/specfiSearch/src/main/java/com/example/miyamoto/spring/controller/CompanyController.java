package com.example.miyamoto.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.miyamoto.spring.entity.Company;
import com.example.miyamoto.spring.service.CompanyService;
 
 @Controller
public class CompanyController {
 
    @Autowired
    CompanyService service;
 
    // 初期表示
    @RequestMapping(value="/company", method=RequestMethod.GET)
    public ModelAndView index(ModelAndView mov) {
    	mov.setViewName("company/index.html");
    	List<Company> companys = service.findAll();
//    	if (companys == null) {
//    		
//    	}
    	System.out.println(companys);
    	
    	mov.addObject("companys", companys);
    	return mov;
    }
 
    // 検索処理
    // Model、ModelAndView、ModelMapの中でModelAndViewを使用。
    // ModelAndView：viewとmodelの両方使える。
    @RequestMapping(value="/company", method=RequestMethod.POST )
    public ModelAndView search(ModelAndView mov, @RequestParam(name="search", required=false) String search) {
    	mov.setViewName("company/index.html");
        List<Company> companys = service.findCompanys(search);
        mov.addObject("companys", companys);
        
        //リダイレクト
//        mav.setViewName("redirect:/slist");
        
        return mov;
    }
 
}
