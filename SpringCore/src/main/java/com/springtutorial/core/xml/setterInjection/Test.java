package com.springtutorial.core.xml.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/springtutorial/core/xml/setterInjection/SpringSetterInjectionConfig.xml");
		Student bean1 = context.getBean("s1",Student.class);
		Student bean2 = context.getBean("s2",Student.class);
		Student bean3 = context.getBean("s3",Student.class);
		System.out.println(bean1);
		System.out.println(bean2);
		System.out.println(bean3);
	}
}
