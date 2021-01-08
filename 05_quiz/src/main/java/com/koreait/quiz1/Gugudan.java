package com.koreait.quiz1;

public class Gugudan {

	// field
	private int startDan;
	private int endDan;
	private int startNum;
	private int endNum;
	private Calculator calculator;
	
	public Gugudan() {
		// TODO Auto-generated constructor stub
	}
	public Gugudan(int startDan, int endDan, int startNum, int endNum, Calculator calculator) {
		super();
		this.startDan = startDan;
		this.endDan = endDan;
		this.startNum = startNum;
		this.endNum = endNum;
		this.calculator = calculator;
	}
	public int getStartDan() {
		return startDan;
	}

	public void setStartDan(int startDan) {
		this.startDan = startDan;
	}

	public int getEndDan() {
		return endDan;
	}

	public void setEndDan(int endDan) {
		this.endDan = endDan;
	}

	public int getStartNum() {
		return startNum;
	}

	public void setStartNum(int startNum) {
		this.startNum = startNum;
	}

	public int getEndNum() {
		return endNum;
	}

	public void setEndNum(int endNum) {
		this.endNum = endNum;
	}

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}
}
