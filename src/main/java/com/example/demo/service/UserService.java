package com.example.demo.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.models.User;

@Service
public class UserService {
	
	private List<User> Users;
		
	public UserService() {
		Users = new ArrayList<>();
		User user1 = new User("Vijay","M",25);
		User user2 = new User("Sagar","M",25);
		User user3 = new User("Vaibhav","M",25);
		User user4 = new User("Udit","M",25);
		
		Users.addAll(Arrays.asList(user1,user2,user3,user4));
		
	}
	
	public List<User> getAllUsers() {
		return Users;
	}
	
	public Optional<User> getUser(Integer id) {
		Optional opt = Optional.empty();
		for(User user: Users) {
			if(id == user.getId()) {
				opt = Optional.of(user);
				return opt;
				
			}
		}
		return opt;
	}

	public User add_user(User user) {
		
		Users.add(user);
		return user;
		
	}

}
