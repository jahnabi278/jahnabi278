package com.demo.multithreading;

public class PrintingThread implements Runnable {

	@Override
	public void run() {
		String newJoinees[] = { "Jay", "Nafeez", "Vipin", "Langdon", "Rupam", "Sahil", "janvi" };
		for (int i = 0; i < newJoinees.length; i++) {
			try {
				System.out.println(newJoinees[i]);
				Thread.sleep(3000);

			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Hello from " + Thread.currentThread().getName() + " class");

	}

}
