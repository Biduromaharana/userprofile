package com.offs.pm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.offs.pm.dto.User;
import com.offs.pm.dto.UserResponse;
import com.offs.pm.service.UserService;

@RestController
@RequestMapping("/user/v1")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;

	}

	@PostMapping("/create")
	public ResponseEntity<UserResponse> createUser(@RequestBody User user) {

		Integer userId = userService.create(user);

		UserResponse response = new UserResponse();
		
		
		response.setMessage("User_created with Id"+userId);

		ResponseEntity<UserResponse> responseEntity = new ResponseEntity<>(response, HttpStatus.CREATED);

		return responseEntity;

	}

	@GetMapping("/findById/{userId}")
	public User getUserById(@PathVariable(name = "userId") String userId) {

		User findById = userService.findById(userId);

		return findById;
	}
}
