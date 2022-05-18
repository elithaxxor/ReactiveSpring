package com.nobodylikes.me.ReactiveSpring02.Controller;
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nobodylikes.me.ReactiveSpring02.Repository.UserRepository;
import com.nobodylikes.me.ReactiveSpring02.Model.User;



@CrossOrigin(origins = "http://localhost:3000") // for react app 
@RestController 
@RequestMapping("api/")
public class UserController {
	
	
	@Autowired
	private UserRepository userRepository; 
	
	@GetMapping("users")
	public List<User> getUsers() {
		return this.userRepository.findAll(); // returns list of all users
	}
	
}
