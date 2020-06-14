package com.example.miyamoto.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpecfiSearchApplication {
	
//	@Autowired
//	private static UserConfig userConf;

	
	public static void main(String[] args) {
//		// ユーザー情報読み込み
//		System.out.println(userConf.getId());
//		System.out.println(userConf.getName());	

		SpringApplication.run(SpecfiSearchApplication.class, args);
	}

}