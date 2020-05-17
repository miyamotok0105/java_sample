package com.example.miyamoto.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import org.thymeleaf.context.Context;

import com.example.miyamoto.spring.entity.Product;
import com.example.miyamoto.spring.service.ProductMailService;

@RestController
public class MailController {
    
	private final JavaMailSender javaMailSender;
    
	@Autowired
	ProductMailService productMailService;
    
    @Autowired
    MailController(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }
    
    @RequestMapping(value="/mail", method=RequestMethod.GET)
    public ModelAndView index(ModelAndView mov) {
    	mov.setViewName("mail/index.html");
//    	mov.addObject("hoge", null);
    	return mov;
    }

    @RequestMapping(value = "/mail/send", method = {RequestMethod.POST} )
    public String send() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();
        mailMessage.setTo("to@example.com"); //送信先
        mailMessage.setReplyTo("replyto@example.com"); //返信先
        mailMessage.setFrom("from@example.com"); //送信元
        mailMessage.setSubject("テストメール");
        mailMessage.setText("テストメールです\nほげほげ");
        javaMailSender.send(mailMessage);
        return "メール送信しました";
    }
    
    @RequestMapping(value = "/mail/product/send", method = {RequestMethod.POST} )
    public String sendProduct() {
		//出力内容設定
		Context context = new Context();
		context.setVariable("name", "ほげ");
		List<Product> productList = new ArrayList<Product>();
		Product p1 = new Product();
		p1.setProductName("りんご");
		p1.setPrice("100");
		productList.add(p1);
		Product p2 = new Product();
		p2.setProductName("すいか");
		p2.setPrice("900");
		productList.add(p2);
		Product p3 = new Product();
		p3.setProductName("メロン");
		p3.setPrice("1,000");
		productList.add(p3);
		context.setVariable("productList", productList);
		
		//メール送信
		productMailService.sendMail(context);
		return "メール送信しました";
    }
}