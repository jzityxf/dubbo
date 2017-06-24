package com.feng;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.feng.dubbo.service.UserService;


public class MyTest {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] { "spring/*.xml" });
		UserService service = (UserService) context.getBean("userService");
		System.err.println("yxf====yxf==="+service.sayHello());
	}
}
