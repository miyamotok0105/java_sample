package com.example.miyamoto.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.miyamoto.spring.domain.model.ValidSampleForm2;

//**********************
// lombokに変えた版
//**********************

@Controller
public class ValidSampleController2 {

    @GetMapping("/validSample2")
    public String index( ValidSampleForm2 validSampleForm2){
        return "validSample2";
    }

    @PostMapping("/validSample2")
    public String input(@Validated ValidSampleForm2 validSampleForm2, BindingResult error, Model model){ //・・・②
        if(error.hasErrors()){ //・・・③
            return "validSample2";
        }
        System.out.print(validSampleForm2.getText1());
    	model.addAttribute("message", validSampleForm2.getText1());
        return "validSampleResult2";
    }
}
