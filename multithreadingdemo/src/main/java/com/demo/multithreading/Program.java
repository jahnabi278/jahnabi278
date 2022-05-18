package com.demo.multithreading;

public class Program {

	public static void main(String[] args) {
		try {
			System.out.println("Starting thread");
			Thread t = new Thread(new PrintingThread());
			t.start();
			Thread.sleep(5000);
			t.interrupt();
			t.join(8000);
			System.out.println("Janvi was here");
			Thread.sleep(2000);
			System.out.println("I have waited for 2 seconds");
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

}
