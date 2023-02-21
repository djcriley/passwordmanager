package com.cooper.passwordmanager;

import com.cooper.passwordmanager.model.Password;
import com.cooper.passwordmanager.repository.PasswordRepository;
import com.cooper.passwordmanager.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PasswordmanagerApplication implements CommandLineRunner {

	@Autowired
	PasswordRepository passwordRepository;
	@Autowired
	PasswordService passwordService;

	public static void main(String[] args) {
		SpringApplication.run(PasswordmanagerApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {


//		passwordRepository.save(new Password(".com", "username", "password"));

//		passwordService.savePassword(new Password(".net", "username", "password"));
	}
}
