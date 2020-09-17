package com.mohammad.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohammad.springboot.model.User;
import com.mohammad.springboot.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	public UserServiceImpl() {
		
	}
	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	public UserRepository getUserRepository() {
		return userRepository;
	}
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);
	}
	
	public Iterable<User> showAllUsers(){
		return userRepository.findAll();
	}
	@Override
	public Iterable<User> deleteByUsername(String username){
		
		 userRepository.deleteByUsername(username);
		 
		 return userRepository.findAll();
	}
	@Override
	public User findByUsername(String username) {
		return userRepository.findByUsername(username);
	}
}
