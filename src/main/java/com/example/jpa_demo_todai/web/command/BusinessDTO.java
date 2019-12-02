package com.example.jpa_demo_todai.web.command;



import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain=true)
@ToString
public class BusinessDTO {

	@NotNull
	@Size(min = 2, max = 256, message = "Name should have 2 - 256 characters")
	String name ="";
	
	@NotNull
	@Size(min = 2, max = 256)
	String email ="";
}
