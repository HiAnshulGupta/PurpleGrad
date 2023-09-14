package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.RegistrationForm;
import com.app.repository.RegisterRepository;

@Transactional
@Service
public class registerServiceIMPL implements registerService {

	@Autowired
	private RegisterRepository regis;
	
	@Override
	public RegistrationForm adduser(RegistrationForm rto) {
		// TODO Auto-generated method stub
		
		return regis.save(rto);
	}

	@Override
	public List<RegistrationForm> getall() {
		// TODO Auto-generated method stub
		return regis.findAll();
	}

	@Override
	public void showdata() {
		// TODO Auto-generated method stub
		System.out.println("datasad");
	}

}
