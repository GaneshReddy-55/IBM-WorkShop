package com.ibm.Accessm;

import com.ibm.pack1.Base1;
import com.ibm.oops.Confirmed;
import com.ibm.oops.Employee;
import com.ibm.oops.Finance;
import com.ibm.oops.HR;
import com.ibm.oops.Intern;

/**
 * Hello world!
 *
 */

public class App 
{
	public void pubf() {
		Base1 b1=new Base1();
		b1.pubf=24;
	}
    public static void main( String[] args )
    {
    	
//    	Employee employee = new Intern(); //up casting
//    	employee.Salary();
//    	employee = new Confirmed(); //up casting
//    	employee.Salary();
    	
    	HR hr=new HR();
    	Finance fi=new Finance();
    	Employee emp=hr.recurit("I"); //Down Casting
    	if(emp != null)
    	fi.process(emp);
    	emp=hr.recurit("P"); //Down Casting
    	if(emp != null)
    	fi.process(emp);
    	emp=hr.recurit("f"); //Down Casting
    	if(emp != null)
    	fi.process(emp);
    	
        
    }
}
