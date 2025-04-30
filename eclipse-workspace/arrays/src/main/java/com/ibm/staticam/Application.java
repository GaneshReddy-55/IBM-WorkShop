package com.ibm.staticam;

class Data{
	public static int value;
	
	{
		System.out.println("Inline-block");
	}
	static {
		value=10;
		System.out.println("Static-Intializer");
	}
	public int getValue() {
		return value;
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Data data1=new Data();
//		Data data2=new Data();
//		
////		data1.value=3;
////		data2.value=4;
//		
//		
//		System.out.println(data1.value); //5
//		System.out.println(data2.value); //5
//		System.out.println(data1.getValue());  //5 
//		
//		Data.value=5;
//		
//		System.out.println(Data.value);
//		
		
		/* Because it load only once class variable */
		
		try {
			Class.forName("com.ibm.staticam.Data");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Without static and object creation we can load a class using Class.forName(). It is called Reflection API

	}

}
