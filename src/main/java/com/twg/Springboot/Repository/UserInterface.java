package com.twg.Springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.Springboot.Entities.Users;

public interface UserInterface extends JpaRepository<Users, Long> {
	 Users findByUsername(String name);
     
}
