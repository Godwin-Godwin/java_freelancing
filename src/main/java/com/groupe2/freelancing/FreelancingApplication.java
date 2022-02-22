package com.groupe2.freelancing;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.groupe2.freelancing.model.Users;
import com.groupe2.freelancing.repository.UsersRepository;

@SpringBootApplication
public class FreelancingApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(FreelancingApplication.class, args);
	}

	@Autowired
	private UsersRepository usersRepository;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		 * Users user1 = new Users(1, "Emmanuel", "Godwin", "godwin18", "sessi@g.com",
		 * "63797435", "provider", "sessi@g.com", "img/male-avatar.png", "M", "active",
		 * LocalDateTime.now().toString()); usersRepository.save(user1);
		 */
		
	}
	
}
