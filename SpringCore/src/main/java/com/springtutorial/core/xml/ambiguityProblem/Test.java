package com.springtutorial.core.xml.ambiguityProblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springtutorial/core/xml/ambiguityProblem/SpringAmbiguityConfig.xml");
		AddTwo bean = context.getBean("add1", AddTwo.class);
		bean.doSum();
	}
}
