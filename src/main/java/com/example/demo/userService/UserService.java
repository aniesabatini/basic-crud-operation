package com.example.demo.userService;

import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.userRepository.UserRepository;


@Service
public class UserService implements UserServiceimpl{

	
	private UserRepository userRepo;
	
	
	public UserService(UserRepository userRepo) {
		super();
		this.userRepo = userRepo;
	}


	@Override
	public Optional<User>getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}


	@Override
	public User createUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}


	public User updateUser(Integer id,User user) {
		// TODO Auto-generated method stub
		User usero=userRepo.findById(id).orElseThrow(()->new RuntimeException("user not found"));
		//usero.setId(user.getId());
		usero.setAge(user.getAge());
		usero.setCity(user.getCity());
		usero.setName(user.getName());
return userRepo.save(usero)		;
		
		
	}
	
	
}
	