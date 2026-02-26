package com.example.demo.controller;

import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.userService.UserServiceimpl;

@RestController
@RequestMapping("/user")
public class UserController {

	private UserServiceimpl userServiceImpl;

	public UserController(UserServiceimpl userServiceImpl) {
		super();
		this.userServiceImpl = userServiceImpl;
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable int id) {
	    return userServiceImpl.getUserById(id)
	            .orElseThrow(() -> new RuntimeException("User not found"));
	}
	@PostMapping("/create")
	public User createUser(@RequestBody User user) {
		return userServiceImpl.createUser(user);
	}
	
	
	
}
