package com.yczd.hp.web.sample.springmvc;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	IUserService userService;

	@RequestMapping(value = "/input", method = { RequestMethod.GET, RequestMethod.POST })
	public String input() {

		return "/input";

	}

	@RequestMapping(value = "/output", method = { RequestMethod.GET, RequestMethod.POST })
	public String output(HttpServletRequest request, Model model) {
		int userId = Integer.parseInt(request.getParameter("id"));

		User user = new User();
		user.setId(userId);
		user = userService.getUserById(user.getId());
		model.addAttribute("user", user);
		return "/output";
	}
}
