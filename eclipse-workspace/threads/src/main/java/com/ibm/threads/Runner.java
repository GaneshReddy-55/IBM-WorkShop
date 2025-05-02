package com.ibm.threads;

//class Run implements Runnable{
//	@Override
//	public void run() {
//		// TODO Auto-generated method stub
//		for(int count=0;count<5;count++) {
//			System.out.println(Thread.currentThread() +" ---> "+ count);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//}
public class Runner {
	
	public static void workload() {
		for(int count=0;count<5;count++) {
			System.out.println(Thread.currentThread() +" ---> "+ count);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Run run=new Run();
//		Thread thread = new Thread(run);
//		System.out.println(thread.getState());
//		thread.start();
//		try {
//			Thread.sleep(100);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			thread.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(thread.getState());
		
		
		Thread thread = new Thread(() -> workload());
		System.out.println(thread.getState());
		thread.start();
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(thread.getState());
		
		

	}

}
