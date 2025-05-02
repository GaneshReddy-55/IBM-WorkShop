package com.ibm.exceptions;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		Arithmetic arithmetic = new Arithmetic();
		assert (arithmetic.sum(2, 4) == 6):"The sum is error";
		System.out.println("End");

	}

}
