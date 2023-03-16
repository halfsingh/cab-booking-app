package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Driver;
import com.example.demo.models.User;
import com.example.demo.service.UserService;

@RestController
public class UserController {
	
	private static UserService userservice;
	
	@Autowired
	public UserController(UserService userservice) {
		this.setUserservice(userservice);
	}
	
	@GetMapping("user/get")
	public User getUser(@RequestParam Integer id ) {
		
		Optional<User> user = getUserservice().getUser(id);
		if(user.isPresent()) {
			return (User) user.get();
		}
		return null;
		
	}
	
	@GetMapping("user/get/all")
	public List<User> getAllDrivers() {
		
		return this.userservice.getAllUsers();
		
	}
	@PostMapping(path = "user/create", consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public User createUser(User user) {
		User dest = this.getUserservice().add_user(user);
		return dest;
	}
	@PostMapping(path = "user/create", consumes= {"application/json"})
	public User createUserJSON(@RequestBody User user) {
		User dest = this.getUserservice().add_user(user);
		return dest;
	}

	public static UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}
	
	
}