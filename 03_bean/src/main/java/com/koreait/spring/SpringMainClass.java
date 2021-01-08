package com.koreait.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {

		String resourcelocation1 = "classpath:app-context1.xml";
		String resourcelocation2 = "classpath:app-context2.xml";
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourcelocation1, resourcelocation2);
		
		Person p = ctx.getBean("person", Person.class);
		p.personInfo();
		ctx.close();
		
	}

}
