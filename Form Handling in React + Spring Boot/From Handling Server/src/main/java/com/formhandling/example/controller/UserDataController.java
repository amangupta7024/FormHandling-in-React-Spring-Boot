package com.formhandling.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.formhandling.example.entity.UserData;
import com.formhandling.example.service.UserDataService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class UserDataController {
	
	@Autowired
	private UserDataService userDataService;
	
	
	@PostMapping("/saveUserData")
	@CrossOrigin(origins = "http://localhost:3000")
	public UserData save(@RequestBody UserData userData) {
		return userDataService.save(userData);
	}
	

}
