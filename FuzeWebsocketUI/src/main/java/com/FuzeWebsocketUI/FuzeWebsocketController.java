package com.FuzeWebsocketUI;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class FuzeWebsocketController {

	@RequestMapping("/welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	@RequestMapping("/index")
	public ModelAndView WelcomePage() {
		return new ModelAndView("index");
	}
	
	
	@RequestMapping("/")
	public ModelAndView dashboard() {
		return new ModelAndView("dashboard");
	}
	@RequestMapping("/employeeList")
	public ModelAndView employeeList() {
		return new ModelAndView("employeeList");
	}
	
	@RequestMapping("/login")
	public ModelAndView loginPage() {
		return new ModelAndView("login");
	}
	@RequestMapping("/empInfo/{empId}")
	public ModelAndView empInfo(@PathVariable String empId) {
		return new ModelAndView("employee_info");
	}

}
