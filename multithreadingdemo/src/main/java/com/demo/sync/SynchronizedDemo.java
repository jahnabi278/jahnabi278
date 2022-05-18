package com.demo.sync;

public class SynchronizedDemo {

	public static void main(String[] args) throws InterruptedException {
		Counter count = new Counter();
		Thread t1 = new Thread(()->
		{
			for(int i =0; i<1000; i++) 
			{
				count.incrementor();
			}
		});
		Thread t2 = new Thread(()->
		{
			for(int i =0; i<1000; i++) 
			{
				count.incrementor();
			}
		});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Count: "+count.count);

	}

}
