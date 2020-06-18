package com.example.miyamoto.spring.domain.model;

import java.util.Date;
import javax.validation.constraints.NotBlank;
import lombok.Data;

//**********************
//lombokに変えた版
//**********************

@Data
public class ValidSampleForm2 {
	@NotBlank(message = "text1を入力してください")
    private String text1;

}
