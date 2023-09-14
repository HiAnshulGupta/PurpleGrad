package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.Columns;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="register")
public class RegistrationForm {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String LastName;
	@Column(name="mobile_number")
	private String MobileNumber;
	@Column(name="password")
	private String Passowrd;
	@Column(name="age")
	private int Age;
	@Column(name="gender")
	private String Gender;
	@Column(name="address")
	private String address;
	
	
	

}
