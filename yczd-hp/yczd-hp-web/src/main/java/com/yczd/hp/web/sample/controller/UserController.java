package com.yczd.hp.web.sample.controller;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yczd.hp.web.sample.daodata.User;
import com.yczd.hp.web.sample.service.IUserService;

@Controller
@RequestMapping("/thymeleaf/user")
public class UserController {

	@Resource
	IUserService userService;

	@RequestMapping(value = "/input", method = { RequestMethod.GET, RequestMethod.POST })
	public String input(Model model) {
		model.addAttribute(new User());
		return "/input";

	}

	@RequestMapping(value = "/output", method = { RequestMethod.GET, RequestMethod.POST })
	public String output(@Valid User user, Errors error, Model model) {
		if (error.hasErrors()) {
			return "/thymeleaf/user/input";
		}
		user = userService.getUserById(user.getId());
		model.addAttribute("user", user);
		return "/output";
	}
}
