package com.demo.intercommunication;

public class Producer implements Runnable {
	Example example;

	public Producer(Example example) {
		this.example = example;
		Thread thread = new Thread(this,"Producer");
		thread.start();
	}

	@Override
	public void run() {
		int number = 0;
		while(true) 
		{
			example.setNum(number++);
			try {Thread.sleep(1000);} catch (InterruptedException e) {e.getMessage();}
		}
		
	}
}
