package com.koreait.quiz2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public class Person {
	// Field
	private String name;  // 이름
	private double weight; // 몸무게
	private double height; // 키
	private BMICalculator bmiCalculator;  // bmi 계산기(체질량지수)
	private ArrayList<String> hobbies; // 최소 3개의 취미
	
	// constructor
	public Person() {
	}
	public Person(String name, double weight, double height, BMICalculator bmiCalculator, ArrayList<String> hobbies) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.bmiCalculator = bmiCalculator;
		this.hobbies = hobbies;
	}
	
	// method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	public ArrayList<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(ArrayList<String> hobbies) {
		this.hobbies = hobbies;
	}
	public void listInfo() {
		for (String item : hobbies) {
			System.out.println(item);
		}
	}
}
