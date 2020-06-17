package com.example.miyamoto.spring.controller;

import java.util.ArrayList;
import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
//mail：MailSender
import org.springframework.mail.MailSender;
//mail：JavaMailSender
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.SimpleMailMessage;
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
    
    
    //================================
    // テキストメール送る
    @Autowired
    private MailSender mailSender;
        
    @RequestMapping(value="/mail/mailsender", method=RequestMethod.GET)
    public String mailSenderSend() {
    	SimpleMailMessage msg = new SimpleMailMessage();
    	msg.setFrom("test@mail.com");
        msg.setTo("miyamotok0105@gmail.com");
        msg.setSubject("テストメール"); //タイトルの設定
        msg.setText("Spring Boot より本文送信"); //本文の設定
        this.mailSender.send(msg);
        return "メール送信しました";
    }
    
    //================================
    // テンプレートメール送る
    @RequestMapping(value="/mail/javamailsender", method=RequestMethod.GET)
    public String javaMailSenderSend() {
    	MimeMessage mail = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper helper = new MimeMessageHelper(mail, true);
            helper.setTo("mymail@mail.co.uk");
            helper.setReplyTo("someone@localhost");
            helper.setFrom("someone@localhost");
            helper.setSubject("Lorem ipsum");
            helper.setText("Lorem ipsum dolor sit amet [...]");
        } catch (MessagingException e) {
            e.printStackTrace();
        } finally {}
        javaMailSender.send(mail);
        return "テンプレメール送信しました";
    }
    
    public void send(String subject, String content) {

        try {
          MimeMessage mail = javaMailSender.createMimeMessage();
          mail.setHeader("Content-Transfer-Encoding", "base64");
          MimeMessageHelper helper = new MimeMessageHelper(mail, false);

          helper.setTo("xxx.yyy.zzz@example.com");
          helper.setReplyTo("*****.*****.*****@gmail.com");
          helper.setFrom("*****.*****.*****@gmail.com");
          helper.setSubject(subject);
          helper.setText(content);

          javaMailSender.send(mail);

        } catch (MessagingException e) {
          e.printStackTrace();
        }
      }

}