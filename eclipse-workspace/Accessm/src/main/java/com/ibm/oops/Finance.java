package com.ibm.oops;
import com.ibm.oops.Confirmed;

public class Finance {
	
	public void process(Employee emp) {
		emp.Salary();
		if(emp instanceof Confirmed) {
		Confirmed confirm =(Confirmed) emp;
		confirm.transportation();
		}
				
	}

}
