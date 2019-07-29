package com.thetKeNoiThat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.thetKeNoiThat.DAO.ProjectsDAO;
import com.thetKeNoiThat.entites.Projects;

@Controller
public class HomePageController {

	@Autowired 
	private ProjectsDAO projectDAO;
	
	@GetMapping(value = {"/thietkenoithathp", "/"})
	public String homePage() {
		projectDAO.save(new Projects("abc", "hoang phat","http:", "image1"));
		return "index";
	}
	
	@GetMapping("/about")
	public String aboutPage() {
		return "about";
	}
	
	@GetMapping("/project")
	public String projectPage() {
		return "project";
	}
	
	@GetMapping("/services")
	public String servicesPage() {
		return "services";
	}
	
	@GetMapping("/blog")
	public String blogPage() {
		return "blog";
	}
	
	@GetMapping("/contact")
	public String contactPage() {
		return "contact";
	}
}
