package com.example.miyamoto.spring.domain.model;

import javax.validation.constraints.NotBlank;

public class ValidSampleForm {
	//Not Blankで必須になる
	@NotBlank(message = "text1を入力してください")
    String text1;

	// getter setterだね。lombokなら書かなくていい。
	// てか省略されるから、ある意味勘違いする時もあるかも。
	
	// text1の値を取得する
    public String getText1() {
        return text1;
    }

 // text1の値をセットする
    public void setText1(String text1) {
        this.text1 = text1;
    }

}
