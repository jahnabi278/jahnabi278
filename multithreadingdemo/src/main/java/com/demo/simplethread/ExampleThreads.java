package com.demo.simplethread;

public class ExampleThreads {
	public void threadMessage(String message) 
	{
		String threadName = Thread.currentThread().getName();
		System.out.format("%s: %s%n", threadName,message);
	}

}
