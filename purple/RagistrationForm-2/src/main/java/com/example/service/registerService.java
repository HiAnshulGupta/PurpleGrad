package com.example.service;

import java.util.List;

import com.app.model.RegistrationForm;

public interface registerService {

	RegistrationForm adduser(RegistrationForm rto);
	List<RegistrationForm> getall();
	void showdata();
	
}
