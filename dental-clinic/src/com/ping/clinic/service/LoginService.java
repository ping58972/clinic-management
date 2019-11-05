package com.ping.clinic.service;

import com.ping.clinic.dao.UserDao;
import com.ping.clinic.pojo.User;

public class LoginService {
	private UserDao userDao = new UserDao();
	public boolean validateUser(String username, String password) {
		User user = userDao.getUserByUsernameAndPassword(username, password);
		if (user == null)
		return false;
		return true;
	}
}
