package com.example.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.RegistrationForm;
import com.example.service.registerService;

@RestController
@CrossOrigin("*")
@RequestMapping("/Register")
public class registerController {
	
	@Autowired
	private registerService serv;
	
	@PostMapping
	public RegistrationForm insertUser(@RequestBody RegistrationForm rto) {
		
		return serv.adduser(rto);
	}
	
//	@GetMapping
//	public List<RegistrationForm> findall(){
//		return serv.getall();
//	}
	
	@GetMapping("/showdata") 
    public void showData() {
		serv.showdata(); 
    }
	
	

}
