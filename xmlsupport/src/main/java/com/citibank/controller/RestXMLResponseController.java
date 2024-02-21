package com.citibank.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.citibank.model.User;

@RestController
@RequestMapping(path="/xml-output",
produces = "application/xml")
public class RestXMLResponseController {

	@GetMapping("/get")
	public ResponseEntity<User> get(){
		User user = new User();
		user.setId(1L);
		user.setName("Rakesh");
		user.setEmail("rakesh@rps.com");
		
		HttpHeaders headers = new HttpHeaders();
		ResponseEntity<User> userModel =
				new ResponseEntity<User>(user,headers,HttpStatus.CREATED);
		return userModel;
	}
}
