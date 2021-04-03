package com.satyateja.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home() {
		return "home";
	}

	@RequestMapping("display")
	public ModelAndView home(@RequestParam("fn")String fname,@RequestParam("ln")String lname) {

		System.out.println(fname+" "+lname);
		ModelAndView mv = new ModelAndView();

		mv.addObject("name",fname);
		mv.setViewName("display");

		
		return mv;
	}

	@RequestMapping("alien")
	public ModelAndView home(Alien alien) {

		ModelAndView mv = new ModelAndView();

		System.out.println(alien);
		mv.addObject("alien",alien);
		mv.setViewName("display");

		
		return mv;
	}
}
