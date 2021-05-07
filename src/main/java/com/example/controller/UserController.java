package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.SingleUserData;
import com.example.dto.UserResp;
import com.example.service.UserService;

@RestController
@RequestMapping("/m11")
public class UserController {
	@Autowired
	UserService service;
	
	@GetMapping("/users")
	public UserResp list(@RequestParam String page)
	{
		System.out.println("Step1");
		
		return service.getUser(page);
		
	}

	/*@GetMapping("/user")
	public SingleUserData  singleUser(@PathVariable int id)
	{
		return "success";
	}*/
}
