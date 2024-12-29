package com.formhandling.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formhandling.example.entity.UserData;
import com.formhandling.example.repository.UserDataRepository;

@Service
public class UserDataService {
	
	@Autowired
	private UserDataRepository userDataRepository;
	
	
	public UserData save(UserData userData) {
		return userDataRepository.save(userData);
	}
}
