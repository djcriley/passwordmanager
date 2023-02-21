package com.cooper.passwordmanager.service;

import com.cooper.passwordmanager.model.Password;
import com.cooper.passwordmanager.model.User;
import com.cooper.passwordmanager.repository.PasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasswordServiceImpl implements PasswordService{

	@Autowired
	PasswordRepository passwordRepository;
	@Override
	public void savePassword(Password password) {

		System.out.println(password);
		passwordRepository.save(password);
	}

	/*
	@Override
	public void saveUser(User user) {
		String encodedPassword = bCryptPasswordEncoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
//        user.setRole(Role.USER);
		userRepository.save(user);
	}

	 */
}
