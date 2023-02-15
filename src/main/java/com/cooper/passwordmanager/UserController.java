package com.cooper.passwordmanager;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {



	private final UserRepository userRepository;

	@GetMapping
	public String getAllUsers(){
		return this.userRepository.findAll().toString();
	}


	@GetMapping("/register")
	public String addUserForm(Model model){
		model.addAttribute("user", new User());
		return "register_form";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
		System.out.println(user);
		userRepository.save(user);
		return "register_success";
	}


}
