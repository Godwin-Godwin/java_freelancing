package com.groupe2.freelancing.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.groupe2.freelancing.model.Users;
import com.groupe2.freelancing.repository.UsersRepository;
import com.groupe2.freelancing.service.UsersService;

@Controller
public class UsersController {
	
	@Autowired
	private UsersRepository usersRepository;
	
	@Autowired
	private UsersService usersService;
	
	@GetMapping("/")
	public String home() {
		return "homePage";
	}
	
	@GetMapping("/sign-up")
	public String getRegistrationForm(Model model) {
		Users user = new Users();
		model.addAttribute("user", user);
		return "sign-up";
	}
	
	@GetMapping("/login")
	public String login(Model model) {
		Users authUser = new Users();
		model.addAttribute("authUser", authUser);
		return "login";
	}
	
	@GetMapping("/forgot-password")
	public String forgotPassword() {
		return "forgot-password";
	}
	
	@GetMapping("/reset-password")
	public String resetPassword() {
		return "reset-password";
	}
	
	@GetMapping("/dashboard")
	public String dashboard() {
		return "dashboard";
	}
	
	@PostMapping("/login")
	public String login(@ModelAttribute("authUser") Users authUser) {
		String authEmail = authUser.getEmail();
		String authPassword = authUser.getPassword();
		
		Users currentUser = usersRepository.getUserForLogin(authEmail, authPassword);

        if (currentUser == null) {
            return "login";
        }
        else {
        	System.out.println(currentUser);
        	System.out.println(currentUser.getPhoneNumber());
        	return "providers/dashboard";	
        }   
	}
	
	@PostMapping("/sign-up")
	public String saveUser(@ModelAttribute("user") Users user) {
		if(user.getGender() == "M") {
			user.setPicturePath("img/MaleAvatar.jpg");
		}else {
			user.setPicturePath("img/MaleAvatar.jpg");
		}
		user.setRegistrationDate(LocalDateTime.now().toString());
		user.setStatus("active");
		
		System.out.println(user.getGender());
		
		usersService.saveUser(user);
		return "dashboard";
	}
	
}