package com.twg.Springboot.Service;

import java.util.List;

import com.twg.Springboot.Entities.Users;

public interface UserServiceInterface {
	public Users saveUser(Users user);
	public Users updateUser(Users user);
	public void deleteUser(Users user);
	public Users getUserById(long id);
	public List<Users> findAllUsers();
	
	public Users findByUsername(String name);
	

}
