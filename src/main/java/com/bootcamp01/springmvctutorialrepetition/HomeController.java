package com.bootcamp01.springmvctutorialrepetition;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //to indicate that this is the controller class for all methods
public class HomeController {

	@RequestMapping("/")  //     "/==>URL" means homepage
	public String home() {
		
		return "index";
	}
	
	
	
}
