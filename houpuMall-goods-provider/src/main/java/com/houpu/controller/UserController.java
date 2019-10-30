package com.houpu.controller;

import com.houpu.model.Brand;
import com.houpu.services.UserServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/King")
public class UserController {

	@Autowired
	private UserServiceimpl userService;

	@GetMapping("/user")
	public List<Brand> getAllUser(){
		return userService.queryById();
	}

}
