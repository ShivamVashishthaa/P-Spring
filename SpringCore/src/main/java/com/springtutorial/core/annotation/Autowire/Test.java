package com.springtutorial.core.annotation.Autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/core/annotation/Autowire/SpringAnnoAutowireConfig.xml");
//		Student bean1 = context.getBean("s1",Student.class);
//		System.out.println(bean1);
		Student bean2 = context.getBean("s2",Student.class);
		System.out.println(bean2);
//		Student bean3 = context.getBean("s3",Student.class);
//		System.out.println(bean3);
	}
}
