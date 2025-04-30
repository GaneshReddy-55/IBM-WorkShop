package com.ibm.oops;

public class HR {
	public Employee recurit(String empType) {
		if(empType.equalsIgnoreCase("i")) {
			return new Intern();	
		}
		else if(empType.equalsIgnoreCase("p")) {
			return new Confirmed();
		}
		else if(empType.equalsIgnoreCase("F")) {
			return new Freelancer();
		}
		return null;
	}

}
