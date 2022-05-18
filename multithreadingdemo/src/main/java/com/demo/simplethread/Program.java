package com.demo.simplethread;

public class Program 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ExampleThreads eThreads = new ExampleThreads();
		eThreads.threadMessage("Starting MessageBody thread");
		Thread t = new Thread(new MessageBody());
		t.start();
		eThreads.threadMessage("Waiting for MessageLoop thread to finish");
		while (t.isAlive()) {
			eThreads.threadMessage("Still waiting...");
			t.join(1000);
			}
		eThreads.threadMessage("Finally!");
	}

}
