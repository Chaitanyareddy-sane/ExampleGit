package com.mindtee.GitExample.controller;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController 
public class Controller {
	 

	@RequestMapping("/")  
	public String hello()   
	{  
	return "Hello Sample GitExample";  
	}  
	}  


