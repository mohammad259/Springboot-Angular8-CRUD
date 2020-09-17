package com.mohammad.springboot.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mohammad.springboot.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
	
	public Iterable<User> deleteByUsername(String username);
	
	public User findByUsername(String username);
}
