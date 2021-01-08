package com.koreait.quiz1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class SpringMainClass {

	public static void main(String[] args) {
		
		String resourceLocations = "app-context1.xml";
		AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(resourceLocations);
		
		Soldier s1 = (Soldier)ctx.getBean("soldier");
		Soldier s2 = ctx.getBean("soldier", Soldier.class);
		
		s1.soldierInfo();
		s2.soldierInfo();
		ctx.close();

	}

}
