package com.example.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author: zhw
 * @createDate: 2020/1/10
 */
@Component
@ConfigurationProperties(prefix = "zhw")
@PropertySource(value={"classpath:zhw.properties"})
public class Person
{
	private String name;

	private int age;

	public Person()
	{
	}

	public Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
