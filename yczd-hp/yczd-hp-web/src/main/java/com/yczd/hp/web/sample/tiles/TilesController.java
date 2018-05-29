package com.yczd.hp.web.sample.tiles;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 */
@Controller
@RequestMapping("/tiles")
public class TilesController {

	@RequestMapping("/body1")
	public String body1(Model model) {
		return "body1.pages";
	}

	@RequestMapping("/body2")
	public String body2(Model model) {
		return "body2.pages";
	}

	@RequestMapping("/mobile")
	public String mobile(Model model) {
		return "body1.mobile";
	}

	@RequestMapping("/signin")
	public String signin(Model model) {
		return "signin.signin.page";
	}

	@RequestMapping("/signon")
	public String signon(Model model) {
		return "signin/signin";
	}

}
