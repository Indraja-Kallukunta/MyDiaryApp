package com.twg.Springboot.Entities;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.*;

@Entity
@Table(name="ENTRIESOFUSER")
public class EntriesOfUser {

   @Id
   @ GeneratedValue(strategy=GenerationType.IDENTITY)
	private long entryid;
    @DateTimeFormat(pattern="yyyy-MM-dd")
	private Date entrydate;
	private String description;
	private long userid;
	
	
	
	public long getEntryid() {
		return entryid;
	}
	public void setEntryid(long entryid) {
		this.entryid = entryid;
	}
	public Date getEntrydate() {
		return entrydate;
	}
	public void setEntrydate(Date entrydate) {
		this.entrydate = entrydate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	
}
