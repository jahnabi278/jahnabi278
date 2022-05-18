package com.demo.threadpool;

public class WorkerThread implements Runnable {
	String name;

	public WorkerThread(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Start " + name);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.getMessage();
		}
		System.out.println("End " + name);
	}
}
