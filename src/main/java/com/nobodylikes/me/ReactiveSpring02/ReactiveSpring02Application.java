package com.nobodylikes.me.ReactiveSpring02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nobodylikes.me.ReactiveSpring02.Model.User;
import com.nobodylikes.me.ReactiveSpring02.Repository.UserRepository;

@SpringBootApplication
public class ReactiveSpring02Application implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(ReactiveSpring02Application.class, args);
	}
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("test_first", "test_last", "test_email"));
		this.userRepository.save(new User("test_2", "2_last", "2_email"));

	}

}
