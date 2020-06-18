package com.example.miyamoto.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.miyamoto.spring.domain.model.ValidSampleForm;

@Controller
public class ValidSampleController {

    @GetMapping("/validSample")
    public String index( ValidSampleForm validSampleForm){
        return "validSample";
    }

    @PostMapping("/validSample")
    public String input(@Validated ValidSampleForm validSampleForm, BindingResult error, Model model){ //・・・②
        if(error.hasErrors()){ //・・・③
            return "validSample";
        }
        System.out.print(validSampleForm.getText1());
    	model.addAttribute("message", validSampleForm.getText1());
        return "validSampleResult";
    }
}
