package com.example.springboot.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: zhw
 * @createDate: 2020/1/4
 */
public class ClassObj
{

	public static void main(String[] args)
	{

		Class classs = String.class;

		String s = "";
		System.out.println(s.getClass());

		System.out.println(classs.getName());

		try
		{
			Class<?> cls = Class.forName("com.example.springboot.designpattern.proxy.ClassObj");
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		InvocationHandler handler = new InvocationHandler()
		{
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
			{
				System.out.println(method);
				if (method.getName().equals("morning"))
				{
					System.out.println("Good morning, " + args[0]);
				}
				return null;
			}
		};
		Hello hello = (Hello) Proxy.newProxyInstance(Hello.class.getClassLoader(), // 传入ClassLoader
				new Class[] { Hello.class }, // 传入要实现的接口
				handler); // 传入处理调用方法的InvocationHandler
		hello.morning("Bob");

	}

}

interface Hello
{
	void morning(String name);
}
