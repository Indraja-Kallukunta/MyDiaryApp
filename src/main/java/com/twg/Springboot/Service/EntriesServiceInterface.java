package com.twg.Springboot.Service;

import java.util.List;

import com.twg.Springboot.Entities.EntriesOfUser;

public interface EntriesServiceInterface {
	public EntriesOfUser saveEntry(EntriesOfUser entriesOfUser);
	public EntriesOfUser updateEntry(EntriesOfUser entriesOfUser);
	public void deleteEntry(EntriesOfUser entriesOfUser);
	public EntriesOfUser getById(long id);
	public List<EntriesOfUser> findAllEntry();
	
	public List<EntriesOfUser> findByUserid(long id);
}
