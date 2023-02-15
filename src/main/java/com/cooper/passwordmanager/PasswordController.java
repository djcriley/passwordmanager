package com.cooper.passwordmanager;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/password")
@AllArgsConstructor
public class PasswordController {

	private final PasswordRepository passwordRepository;
	private final UserRepository userRepository;

	@PostMapping("/add")
	public String submitForm(@ModelAttribute("temp") Password password, @ModelAttribute("user") User user) {
		System.out.println(password);
		//password.pc_find = user.getId();
		passwordRepository.save(password);
		return "password_success";
	}

	@GetMapping("/add")
	public String addUserForm(Model model){
		model.addAttribute("temp", new Password());

		Object[] listUsers = userRepository.findAll().toArray();
		model.addAttribute("listUsers", listUsers);
		model.addAttribute("user", new User());
//		List<Integer> listProfession = Arrays.asList(1, 2, 3);
//		model.addAttribute("listProfession", listProfession);
		return "password_form";
	}


}
