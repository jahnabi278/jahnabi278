package com.demo.intercommunication;

public class Consumer implements Runnable {
	Example example;

	public Consumer(Example example) {
		this.example = example;
		Thread thread = new Thread(this,"Consumer");
		thread.start();
	}

	@Override
	public void run() {
		while(true) 
		{
			example.getNum();
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.getMessage();}
		}
		
	}

}
