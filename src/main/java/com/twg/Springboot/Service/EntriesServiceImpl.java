package com.twg.Springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twg.Springboot.Entities.EntriesOfUser;
import com.twg.Springboot.Entities.Users;
import com.twg.Springboot.Repository.EntriesInterface;

@Service
public class EntriesServiceImpl implements EntriesServiceInterface {
	@Autowired
    private EntriesInterface entriesInterface;
	@Override
	public EntriesOfUser saveEntry(EntriesOfUser entriesOfUser) {
		EntriesOfUser entriesOfUser1= entriesInterface.save(entriesOfUser);
		return entriesOfUser1;
	}

	@Override
	public EntriesOfUser updateEntry(EntriesOfUser entriesOfUser) {
		EntriesOfUser entriesOfUser1= entriesInterface.save(entriesOfUser);
		return entriesOfUser1;
	}

	@Override
	public void deleteEntry(EntriesOfUser entriesOfUser) {
		entriesInterface.delete(entriesOfUser);
	}

	@Override
	public EntriesOfUser getById(long id) {
		EntriesOfUser entriesOfUser1= entriesInterface.findById(id).get();
		return entriesOfUser1;
	}

	@Override
	public List<EntriesOfUser> findAllEntry() {
		List<EntriesOfUser> entriesOfUser1= entriesInterface.findAll();
		return entriesOfUser1;
	}

	@Override
	public List<EntriesOfUser> findByUserid(long id) {
		List<EntriesOfUser> users = entriesInterface.findByUserid(id);
		return users;
	}
	
	
	

}
