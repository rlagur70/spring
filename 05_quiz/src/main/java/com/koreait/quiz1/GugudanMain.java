package com.koreait.quiz1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class GugudanMain {

	public static void main(String[] args) {

		String resourceLocation = "classpath:app-context.xml";
		AbstractApplicationContext  ctx = new GenericXmlApplicationContext(resourceLocation);
		
		Calculator cal = ctx.getBean("calculator", Calculator.class);
		Gugudan gugu= ctx.getBean("gugudan", Gugudan.class);
		
	}

}
