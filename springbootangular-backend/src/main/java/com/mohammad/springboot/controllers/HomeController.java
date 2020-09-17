package com.mohammad.springboot.controllers;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mohammad.springboot.model.User;
import com.mohammad.springboot.service.UserService;

@RestController
public class HomeController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/save")
	@Transactional
	@CrossOrigin(origins="http://localhost:4200")
	public String register(@RequestBody User user) {
		service.saveUser(user);
		return "Hello "+user.getFirstname()+ ", your Registration Successful...!!! ";
	}

	@GetMapping("/showAllUsers")
	@CrossOrigin(origins="http://localhost:4200")
	public Iterable<User> showAllUsers() {
		return service.showAllUsers();
		
	}
	@GetMapping("/delete/{username}")
	@Transactional
	@CrossOrigin(origins="http://localhost:4200")
	public Iterable<User> deleteByUsername(@PathVariable String username){
		return service.deleteByUsername(username);
	}
	
	@GetMapping("/search/{username}")
	@CrossOrigin(origins="http://localhost:4200")
	public User search(@PathVariable String username) {
		return service.findByUsername(username);
	}
	
}
