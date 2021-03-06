package com.example.miyamoto.spring.login.controller;

import java.util.LinkedHashMap;
import java.util.Map;

import com.example.miyamoto.spring.domain.model.SignupForm;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignupController {
	
    private Map<String,String> radioMarriage;

    private Map<String,String> initRadioMarriage(){
        Map<String,String> radio = new LinkedHashMap<>();

        radio.put("既婚", "true");
        radio.put("未婚", "false");

        return radio;
    }

    @GetMapping("/signup")
    public String getSingUp(@ModelAttribute SignupForm form, Model model){

        radioMarriage = initRadioMarriage();

        model.addAttribute("radioMarriage", radioMarriage);

        return "login/signup";
    }

    @PostMapping("/signup")
    public String postSignUp(@ModelAttribute @Validated SignupForm form, 
        BindingResult bindingResult,Model model){
//    	System.out.println(bindingResult);

    	//画面エラー
        if(bindingResult.hasErrors()){
            return getSingUp(form, model);
        }

        System.out.println(form);
        return"redirect:/login";
    }

}
