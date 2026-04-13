package com.twg.Springboot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.Springboot.Entities.EntriesOfUser;
import com.twg.Springboot.Entities.Users;

public interface EntriesInterface extends JpaRepository<EntriesOfUser, Long> {
	List<EntriesOfUser> findByUserid(long id);
}
