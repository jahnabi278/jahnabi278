package com.demo.criticalsection;

public class Program {
	public static void main(String args[]) throws InterruptedException {
		System.out.println("Starting......");
		Thread t1 = new Thread(new WriterWorker1());
		Thread t2 = new Thread(new WriterWorker2());
		Thread t3 = new Thread(new ReaderWorker());
		System.out.println("WriterWorker1...");
		t1.start();
		t1.join();
		Thread.sleep(1000);
		System.out.println("WriterWorker2...");
		t2.start();
		t2.join();
		Thread.sleep(1000);
		System.out.println("ReaderWorker...");
		t3.start();
		t3.join();
		Thread.sleep(1000);
		System.out.println("Ending.....");
	}
}
