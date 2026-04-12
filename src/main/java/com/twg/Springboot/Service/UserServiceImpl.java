package com.twg.Springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Springboot.Entities.User3;
import com.twg.Springboot.Repository.UserInterface;

@Service
public class UserServiceImpl implements UserServiceInterface {
    
	@Autowired
	private UserInterface userInterface;
	@Override
	public User3 saveUser(User3 user) {
		 User3 user1 = userInterface.save(user);
		return user1;
	}

	@Override
	public User3 updateUser(User3 user) {
		User3 user1 = userInterface.save(user);
		return user1;
	}

	@Override
	public void deleteUser(User3 user) {
		userInterface.delete(user);
	}

	@Override
	public User3 getUserById(long id) {
		User3 user1 = userInterface.findById(id).get();
		return user1;
	}


	@Override
	public List<User3> findAllUsers() {
		List<User3> user1 = userInterface.findAll();
		return user1;
	}

	@Override
	public User3 findByUsername(String name) {
		 User3 user1 = userInterface.findByUsername(name);
		return user1;
	}

	

}
