package com.srikanth.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {	
		
		// created Student Object
		Student theStudent = new Student();
		
		// created the model at which student is assigned 
		theModel.addAttribute("student", theStudent);
		
		return "student-form";
	}
	
	
}
