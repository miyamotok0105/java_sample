package com.example.miyamoto.spring.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//設定のusersを読み込む
//◆properties
//users.intervel=1000
//◆yml
//users
//  intervel: 1000
@ConfigurationProperties(prefix="users")
public class UserConfig {

	//intervelの部分を取得
    private int intervel;

    public int getIntervel() {
        return intervel;
    }

    public void setIntervel(int intervel) {
        this.intervel = intervel;
    }
}
