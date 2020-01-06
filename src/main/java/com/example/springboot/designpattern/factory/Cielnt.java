package com.example.springboot.designpattern.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
public class Cielnt
{
	ApplicationContext context = new FileSystemXmlApplicationContext(
			"C:/work/IOC Containers/springframework.applicationcontext/src/main/resources/bean-factory-config.xml");

}
