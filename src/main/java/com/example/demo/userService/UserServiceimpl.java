package com.example.demo.userService;

import java.util.Optional;

import com.example.demo.entity.User;

public interface UserServiceimpl {

	public  Optional<User> getUserById(int id) ;
	

	public User createUser(User user);

	public User updateUser(Integer id,User user);

	

}
