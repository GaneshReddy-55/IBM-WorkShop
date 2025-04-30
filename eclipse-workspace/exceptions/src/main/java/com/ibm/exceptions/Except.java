package com.ibm.exceptions;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			System.out.println(args[0]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Run the program supplying a number or text");
		}
		catch(ArithmeticException ex) {
			System.out.println("You cannot divide by zero");
		}
		catch(NumberFormatException ex) {
			System.out.println("Please provide valid number");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Normal terminated");
		}
	}

}
