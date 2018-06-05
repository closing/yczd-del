package com.yczd.hp.web.sample.thymeleaf;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/thymeleaf")
public class HomeController {

	@RequestMapping(method = GET)
	public String home(Model model) {
		return "home";
	}

}
