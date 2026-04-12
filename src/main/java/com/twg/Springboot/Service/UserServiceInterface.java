package com.twg.Springboot.Service;

import java.util.List;

import com.twg.Springboot.Entities.User3;

public interface UserServiceInterface {
	public User3 saveUser(User3 user);
	public User3 updateUser(User3 user);
	public void deleteUser(User3 user);
	public User3 getUserById(long id);
	public List<User3> findAllUsers();
	
	public User3 findByUsername(String name);
	

}
