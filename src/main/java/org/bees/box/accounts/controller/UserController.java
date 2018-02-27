package org.bees.box.accounts.controller;

import org.bees.box.accounts.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("list")
	public String userForm(Model model) {
		model.addAttribute("users", userService.getAll());
		return "user_list";
	}
	
	@RequestMapping("sign-up")
	public String signUp(Model model) {
		model.addAttribute("title", "Sign-up for new account");
		return "sign-up";
	}
}
