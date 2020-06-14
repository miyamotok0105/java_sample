package com.example.miyamoto.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertiesConfiguration {

	// DIに登録
    @Bean
    public UserConfig userConfig() {
        return new UserConfig();
    }
}
