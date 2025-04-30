package com.ibm.interfaces;

interface Printer{
	void print();
}

//class HPPrinter implements Printer{
//	@Override
//	public void print() {
//		// TODO Auto-generated method stub
//		System.out.println("Printer printing...");
//	}
//	
//	
//}
class Process{
	public void excute(Printer print) {
		print.print();
	}
}

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Process process = new Process();
//		process.excute(new HPPrinter() {
//			@Override
//			public void print() {
//				// TODO Auto-generated method stub
//				System.out.println("Printer printing...");
//			}
//		});
		
		process.excute(() ->
				System.out.println("Printer printing..."));

	}

}
