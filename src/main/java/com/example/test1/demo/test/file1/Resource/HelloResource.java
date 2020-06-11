package com.example.test1.demo.test.file1.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/docker/hello")
public class HelloResource {
	
	@GetMapping
	public String hello () {
		return "Hello world! Deveops Demo ";
	}
	

}
