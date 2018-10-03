package org.test.service;

public class UserValidService {

	public boolean isUserValid(String user, String password) {
		if (user.equals("admin") && password.equals("dummy")) {
			return true;
		} else {
			return false;
		}
	}
}