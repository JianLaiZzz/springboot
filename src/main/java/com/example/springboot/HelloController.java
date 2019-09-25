package com.example.springboot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController
{
	@Value("${name}")
	private String name;

	@Value("${age}")
	private int age;

	/*@RequestMapping("/hello")
	public String hello()
	{
		return name+age;
	}*/

	@RequestMapping("/hello")
	public String hello()
	{
		return name+age;
	}
}
