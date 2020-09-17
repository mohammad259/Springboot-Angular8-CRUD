package com.mohammad.springboot.service;

import com.mohammad.springboot.model.User;

public interface UserService {

	public void saveUser(User user);
	
	public Iterable<User> showAllUsers();
	
	public Iterable<User> deleteByUsername(String username);
	
	public User findByUsername(String username);
	
}
