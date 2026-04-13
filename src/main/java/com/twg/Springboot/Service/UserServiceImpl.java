package com.twg.Springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Springboot.Entities.Users;
import com.twg.Springboot.Repository.UserInterface;

@Service
public class UserServiceImpl implements UserServiceInterface {
    
	@Autowired
	private UserInterface userInterface;
	@Override
	public Users saveUser(Users user) {
		 Users user1 = userInterface.save(user);
		return user1;
	}

	@Override
	public Users updateUser(Users user) {
		Users user1 = userInterface.save(user);
		return user1;
	}

	@Override
	public void deleteUser(Users user) {
		userInterface.delete(user);
	}

	@Override
	public Users getUserById(long id) {
		Users user1 = userInterface.findById(id).get();
		return user1;
	}


	@Override
	public List<Users> findAllUsers() {
		List<Users> user1 = userInterface.findAll();
		return user1;
	}

	@Override
	public Users findByUsername(String name) {
		 Users user1 = userInterface.findByUsername(name);
		return user1;
	}

	

}
