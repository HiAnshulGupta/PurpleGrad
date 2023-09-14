package com.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "register")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Register {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long ID;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String LastName;

	@Column(name = "mobile_number")
	private String MobileNumber;

	@Column(name = "Email",unique = true)
	@NotBlank(message = "Email is required")
	@Email(message = "Invalid email format")
	private String email;

	@Column(name = "password")
	private String Password;

	@Column(name = "age")
	private int Age;

	@Column(name = "gender")
	private String Gender;

	@Column(name = "address")
	private String address;

	

}
