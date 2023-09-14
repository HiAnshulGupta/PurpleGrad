package com.app.model;

import javax.persistence.Column;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class RegisterDTO {
	
	
	private String firstName;

	
	private String LastName;

	
	private String MobileNumber;

	
	private String Email;

	
	private String Passowrd;

	@Column(name = "age")
	private int Age;

	@Column(name = "gender")
	private String Gender;

	
	private String address;


}
