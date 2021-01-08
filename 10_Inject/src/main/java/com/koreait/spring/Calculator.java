package com.koreait.spring;

import org.springframework.stereotype.Component;

// 안녕 난 calc라고 해

@Component("calculator")	// <bean id="calculator"> 로 이름을 줌
public class Calculator {

	// method
	public void add(int a, int b) {
		System.out.println(a+"+"+"="+(a+b));
	}
	public void subtract(int a, int b) {
		System.out.println(a+"-"+b+"="+(a-b));
	}

	public void multiply(int a, int b) {
		System.out.println(a+"*"+b+"="+(a*b));
	}

	public void divide(int a, int b) {
		System.out.println(a+"/"+b+"="+(a/b));
	}
}
