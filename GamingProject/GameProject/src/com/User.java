package com;

import java.util.HashMap;

public class User implements IValidate {
	private String userid;
	private String password;
	
	private static HashMap<String, String> userStorage = new HashMap<String, String>();

	public String getUserid() {
		return userid;
	}

	public User(String userid, String password) {
		super();
		this.userid = userid;
		this.password = password;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	static void addUser(String userid,String password){
		if(userid==null || password==null) {
			System.out.println("Not a valid user");
		}
		userStorage.put(userid, password);
	}

	@Override
	public boolean IsAuthenticated(String userid, String password) {
		return true;
	}
}
