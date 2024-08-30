package com.restdemo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.dto.Users;

@RestController
public class Home {

	  @GetMapping("/add")
		public int addMark (@RequestParam("a")int op1,@RequestParam("b") int op2){
		  return op1 +op2;
	  }
	  @GetMapping("/sub")
		public int subMark (@RequestParam("a")int op1,@RequestParam("b") int op2){
		  return op1 -op2;
	  }
	  @GetMapping("/mul")
		public int mulMark (@RequestParam("a")int op1,@RequestParam("b") int op2){
		  return op1 *op2;
	  }
	  @GetMapping("/div")
		public int divMark (@RequestParam("a")int op1,@RequestParam("b") int op2){
		  return op1 /op2;
	  }
	  @GetMapping("/add1/{a}/{b}")
		public int addMark1 (@PathVariable("a")int op1,@PathVariable("b") int op2){
		  return op1 +op2;
	  }
	  @PostMapping("/save")
	  public String saveUserData(@RequestBody Users users) {
		  if(users.getUsername().equals("Tony")) {
			  return "Valid username";
		  }
		  return "Invalid user";
	  }
}	
