package com.app.controller;

import java.util.List;
import java.util.Optional;

import org.apache.catalina.connector.Response;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Repository.StudentRepo;

import com.app.model.LoginDTO;
import com.app.model.Register;
import com.app.model.RegisterDTO;
import com.app.register_exceptions.ResourceNotFoundException;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/")
public class StudentController {

	@Autowired
	private StudentRepo strepo;

	
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	
	@PostMapping("Register")
	public Register insert(@RequestBody Register reg) {
		
		String encPassword = passwordEncoder.encode(reg.getPassword());
		reg.setPassword(encPassword);
		
		return strepo.save(reg);
	}



	

	@PostMapping("login")
	public ResponseEntity<String> authenticate(@RequestBody LoginDTO lg) {
	    Optional<Register> userOptional = strepo.findByEmail(lg.getEmail());
	    
	    if (userOptional.isEmpty()) {
	        // Return an appropriate response for invalid credentials
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	            .body("Invalid email or password");
	    }
	    
	    Register reg = userOptional.get();
	    String rawpass = lg.getPassword();
	    
	    if (passwordEncoder.matches(rawpass, reg.getPassword())) {
	        // Authentication successful, return a success response
	        return ResponseEntity.ok("Authentication successful");
	    } else {
	        // Return an appropriate response for invalid credentials
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	            .body("Invalid email or password");
	    }
	}
	

	@PostMapping("/{id}")
	public ResponseEntity<Register> GetStudent(@PathVariable Long id) {
		Optional<Register> user = strepo.findById(id);
		if (user.isPresent()) {
			Register student = user.get();
			return ResponseEntity.ok(student);
		} else {
			return ResponseEntity.notFound().build();
		}
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
		if (!strepo.existsById(id)) {
			return ResponseEntity.notFound().build();
		}

		// Delete the student from the repository
		strepo.deleteById(id);
		System.out.println("deleted successfully");
		return ResponseEntity.noContent().build();
	}
	
	@GetMapping
	public List<Register> getall() {
		
		return strepo.findAll();
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<Register> update(@PathVariable long id,@RequestBody Register updateRe) {
		
		Optional<Register> reg=strepo.findById(id);
		if(reg.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		Register student=reg.get();
		 if (updateRe.getFirstName() != null) {
		        student.setFirstName(updateRe.getFirstName());
		    }
		    if (updateRe.getLastName() != null) {
		        student.setLastName(updateRe.getLastName());
		    }
		    if (updateRe.getEmail() != null) {
		        student.setEmail(updateRe.getEmail());
		    }
		    if (updateRe.getPassword() != null) {
		        student.setPassword(updateRe.getPassword());
		    }
		    if (updateRe.getAddress() != null) {
		        student.setAddress(updateRe.getAddress());
		    }
		    student = strepo.save(student);
		return ResponseEntity.ok(student);
	}

}