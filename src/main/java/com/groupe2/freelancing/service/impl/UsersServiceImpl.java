package com.groupe2.freelancing.service.impl;

import org.springframework.stereotype.Service;

import com.groupe2.freelancing.model.Users;
import com.groupe2.freelancing.repository.UsersRepository;
import com.groupe2.freelancing.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	
	private UsersRepository usersRepository;

	public UsersServiceImpl(UsersRepository usersRepository) {
		super();
		this.usersRepository = usersRepository;
	}
	
	@Override
	public Users saveUser(Users user) {
		return usersRepository.save(user);
	}
	
}
