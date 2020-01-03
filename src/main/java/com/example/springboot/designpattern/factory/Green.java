package com.example.springboot.designpattern.factory;

public class Green implements Color
{
	@Override
	public void fill()
	{
		System.out.println("Inside Green::fill() method.");
	}
}
