package com.cooper.passwordmanager.controller;

import com.cooper.passwordmanager.PasswordmanagerApplication;
import com.cooper.passwordmanager.model.Password;
import com.cooper.passwordmanager.model.User;
import com.cooper.passwordmanager.repository.UserRepository;
import com.cooper.passwordmanager.service.PasswordService;
import com.cooper.passwordmanager.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

	@Autowired
	private PasswordService passwordService;



	@RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
	public String homePage(){
		return "user/dashboard";
	}

	@RequestMapping(value = {"/addpassword"}, method = RequestMethod.GET)
	public String addPassword(Model model){
		model.addAttribute("obj", new Password());
		return "user/home";
	}

	@RequestMapping(value = {"/addpassword"}, method = RequestMethod.POST)
	public String addPassword(Model model, Password password){


		System.out.println(password.toString());
		System.out.println(password);

		passwordService.savePassword(password);
		model.addAttribute("successMessage", "Password registered successfully!");

		return "user/dashboard";
	}

}
