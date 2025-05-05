package com.ibm.junit5;

public class Calculator {
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int divide(int num1, int num2) {
		return num1/num2;
	}
	
	public void getConnection() {
		try {
			Thread.sleep(101);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Connected...");
	}

	public boolean isEven(int num1) {
		return num1%2 == 0;
	}
}
