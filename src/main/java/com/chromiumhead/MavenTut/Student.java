package com.chromiumhead.MavenTut;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", city=" + city + "]";
	}

	@Id
	private int sid;
	private String sname;
	private String city;
	
	public Student(int sid, String sname, String city) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.city = city;
	}

	public Student() {
		super();
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
