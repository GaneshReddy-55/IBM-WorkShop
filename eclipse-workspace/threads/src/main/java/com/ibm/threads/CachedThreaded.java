package com.ibm.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.ibm.threads.ExecutiveServices.Task;

public class CachedThreaded {

	public static void main(String[] args) {
		
		
		ExecutorService service = Executors.newCachedThreadPool();
		
		for(int count=0;count<10;count++) {
			service.execute(new Task(count));
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
