package com.ibm.threads;

class Data{
	private int value;

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
}

public class Producer {
	Data data;
	
	Producer(){
		data=new Data();
	}
	
	public void workload() {
		for(int count=0;count<5;count++) {
			Thread cur=Thread.currentThread();
			System.out.println(Thread.currentThread() +" ---> "+ count);
			if(cur.getName() == "Producer") {
				synchronized (data) {
					data.setValue(count);
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			else if(cur.getName() == "Consumer") {
				synchronized (data) {
					System.out.println(data.getValue());
					try {
						data.notify();
						data.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer app=new Producer();
		Thread thread = new Thread(() -> app.workload(), "Producer");
		Thread thread1 = new Thread(() -> app.workload(), "Consumer");
		System.out.println(thread.getState());
		thread.start();
		thread1.start();
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
		System.out.println(thread.getState());

	}

}
