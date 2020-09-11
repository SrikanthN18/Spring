package com.srikanth.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/funny")
public class SillyController {
	
	@RequestMapping("/showForm")
	public String silly() {
		return "helloworld-form";
	}

	@RequestMapping("/silly")
	public String personalDiscovery(
			@RequestParam("studentName") String theName, Model model) {
		
		theName = theName.toUpperCase();
		
		String result = "Here is my friend : " + theName;
		
		model.addAttribute("message", result);
		
		return "helloworld";
	}
}
