package com.cooper.passwordmanager.service;

import com.cooper.passwordmanager.model.User;

import java.util.List;

public interface UserService {
	public void saveUser(User user);
	public List<Object> isUserPresent(User user);

}