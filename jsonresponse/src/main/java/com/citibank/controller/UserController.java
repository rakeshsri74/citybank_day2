package com.citibank.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.model.User;

@RestController
@RequestMapping("/api")
public class UserController {

	@GetMapping("/user")
	//@RequestMapping(path="/user",method=RequestMethod.GET)
	public ResponseEntity<User> getUser(){
		User user = new User(123,"Rakesh","Rakesh@rps.com");
		return ResponseEntity.ok().body(user);
	}
}
