package com.Demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

		@GetMapping("/")
		public String hello(Model model) {
			model.addAttribute("name","Gayu");
			return "welcome";
			
		}
}
