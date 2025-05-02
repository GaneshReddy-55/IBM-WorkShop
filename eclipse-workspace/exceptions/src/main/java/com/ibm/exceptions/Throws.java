package com.ibm.exceptions;

class IllegalAgeException extends Exception{
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Under age of 18, your not eligible for register for voting";
	}
	
}
class ElectionVoting{
	public void register(int age) throws IllegalAgeException {
		if(age < 18) {
			throw new IllegalAgeException();
		}
		System.out.println("Registration Completed");
	}
}
public class Throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectionVoting electionVoting = new ElectionVoting();
		try {
			electionVoting.register(12);
		} catch (IllegalAgeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
