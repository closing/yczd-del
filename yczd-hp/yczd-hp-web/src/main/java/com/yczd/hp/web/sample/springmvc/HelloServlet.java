package com.yczd.hp.web.sample.springmvc;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * SpringMVC Example
 * @author ZHU
 *
 */
@Controller
@Scope("prototype")
@RequestMapping("/springmvc")
public class HelloServlet {

	@RequestMapping(value = "/index", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView index() {
		ModelAndView mov = new ModelAndView();
		mov.setViewName("/index");
		return mov;

	}

	@RequestMapping(value = "/greeting", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView greeting(String name) {

		if (name == null || name == "") {
			name = "world";
		}
		ModelAndView mov = new ModelAndView();
		mov.addObject("greeting", "Hello " + name + "!");
		mov.setViewName("/greeting");
		return mov;
	}

	@RequestMapping("/body1")
	public String signin() {
		return "body1";
	}
}
