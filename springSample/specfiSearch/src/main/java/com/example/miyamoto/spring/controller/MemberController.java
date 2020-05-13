package com.example.miyamoto.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.miyamoto.spring.entity.Member;
import com.example.miyamoto.spring.service.MemberService;
 
 
@Controller
public class MemberController {
 
    @Autowired
    MemberService service;
 
    // 初期表示
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String index() {
        return "index";
    }
 
    // 検索処理
    @RequestMapping(value="/", method=RequestMethod.POST )
    public ModelAndView search(ModelAndView mov, @RequestParam(name="search", required=false) String search) {
        mov.setViewName("index");
        List<Member> members = service.findMembers(search);
        mov.addObject("members", members);
        return mov;
    }
 
}
