package com.koreait.quiz2;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {

		String resourceLocations = "classpath:app-context2.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(resourceLocations);
		
		BMICalculator bcal= ctx.getBean("bmicalculator", BMICalculator.class);
		Person p = ctx.getBean("person", Person.class);
		p.listInfo();
		
		ctx.close();
	}

}
