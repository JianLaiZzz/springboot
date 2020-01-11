package com.example.springboot;

import com.example.springboot.bean.Person;
import com.zhw.springboot.statrt.hello.Hello;
import org.springframework.beans.factory.annotation.Autowired;
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

	@Autowired
	private Hello h;

	@Autowired
	private Person person;

	/*@RequestMapping("/hello")
	public String hello()
	{
		return name+age;
	}*/

	@RequestMapping("/hello")
	public String hello()
	{

		System.out.println(person.toString());

		h.sayHello();
		return h.sayHello();
	}
}
