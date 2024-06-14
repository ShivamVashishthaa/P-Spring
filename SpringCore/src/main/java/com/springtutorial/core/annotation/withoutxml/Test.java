package com.springtutorial.core.annotation.withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
//		Student bean1 = context.getBean("s1",Student.class);
//		System.out.println(bean1);
		Student bean2 = context.getBean("getStudent", Student.class);
		System.out.println(bean2);
//		Student bean3 = context.getBean("s3",Student.class);
//		System.out.println(bean3);
	}
}
