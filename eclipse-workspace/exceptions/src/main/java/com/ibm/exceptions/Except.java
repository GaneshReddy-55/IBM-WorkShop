package com.ibm.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Except {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner sc = new Scanner(System.in);
			int num1 =sc.nextInt();
			int num2=sc.nextInt();
			try {
			int div= num1/num2;
			//System.exit(0); // finally block not always executed 100%
			System.out.println(div);
			}catch(ArithmeticException exception) {
				System.out.println("can't divide by zero and Nested Catch");
			}
			finally {
				System.out.println("End of outer try");
			}
		}
		catch(InputMismatchException | NumberFormatException e) {
			System.out.println("Run the program supplying a number or text");
		}
		catch(ArithmeticException ex) {
			System.out.println("You cannot divide by zero");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Normal terminated");
		}
	}

}
