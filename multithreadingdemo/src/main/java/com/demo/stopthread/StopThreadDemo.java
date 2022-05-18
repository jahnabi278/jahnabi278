package com.demo.stopthread;

public class StopThreadDemo extends Thread {
	private boolean shouldExit = false;

	public void setShouldExit(boolean shouldExit) {
		this.shouldExit = shouldExit;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				if (shouldExit) {
					break;
				}
				System.out.println("I am inside Loop");
				Thread.sleep(200);
			}
			System.out.println("Thread is completed");
		} catch (InterruptedException ex) {
			System.out.println(ex.getMessage());
		}
	}
}
