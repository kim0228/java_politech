package com.kopo.thecute;

public class User {
	public int idx;
	public String id;
	public String password;
	public int birthday;
	public String name;
	
	User(String id, String password, int birthday, String name){
		this.id = id;
		this.password = password;
		this.birthday = birthday;
		this.name = name;
	}
}
