package com.example.miyamoto.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.miyamoto.spring.config.UserConfig;

//当然@Controller忘れるとurl呼べないよ
@Controller
public class UserController {

	@Autowired
    private UserConfig userConfig;

	
	@RequestMapping(value="/user", method=RequestMethod.GET)
    public ModelAndView getUser(ModelAndView mov) {
		int intervel = userConfig.getIntervel();
		mov.setViewName("user/index");
		mov.addObject("intervel", intervel);
        return mov;
    }
	
}
