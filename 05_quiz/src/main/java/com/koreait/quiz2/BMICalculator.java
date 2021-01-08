package com.koreait.quiz2;

public class BMICalculator {

	// bmi = 몸무게(kg) / 키(m) 제곱
	// Field
	// 저체중(bmi : ~19) 
	private double normal; // 정상(bmi : 20~25)
	private double over; // 과체중(bmi : 26~30)
	private double obesity; // 비만(bmi : 31~)
	
	// constructor
	public BMICalculator() {
	}
	public BMICalculator(double normal, double over, double obesity) {
		super();
		this.normal = normal;
		this.over = over;
		this.obesity = obesity;
	}

	// method
	public double getNormal() {
		return normal;
	}
	public void setNormal(double normal) {
		this.normal = normal;
	}
	public double getOver() {
		return over;
	}
	public void setOver(double over) {
		this.over = over;
	}
	public double getObesity() {
		return obesity;
	}
	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	public void bmiCalculator(double weight, double height) {
		double result = weight/(height*height);
		if(result>=31) {
			System.out.println("지수: "+result+getObesity());
		}else if(result<31 && result>25) {
			System.out.println("지수: "+result+getOver());
		}else if(result<26 && result>19) {
			System.out.println("지수: "+result+getNormal());
		}
	}
	
	
}
