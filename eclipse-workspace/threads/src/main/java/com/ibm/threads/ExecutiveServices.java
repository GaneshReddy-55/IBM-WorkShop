package com.ibm.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutiveServices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vCPUs = Runtime.getRuntime().availableProcessors();
		System.out.println(vCPUs);
		ExecutorService service = Executors.newFixedThreadPool(vCPUs);
		
		for(int count=0;count<10;count++) {
			service.execute(new Task(count));
		}

	}
	
	static class Task implements Runnable{
		int counter;
		Task(int counter){
			this.counter = counter;
		}
		
		@Override
			public void run() {
				// TODO Auto-generated method stub
			System.out.println(Thread.currentThread()+ " ---> "+ counter);
				
			}
	}

}
