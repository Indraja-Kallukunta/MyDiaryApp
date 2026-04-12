package com.twg.Springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.Springboot.Entities.User3;

public interface UserInterface extends JpaRepository<User3, Long> {
	 User3 findByUsername(String name);
     
}
