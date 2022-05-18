package com.demo.test;

public class Main1 {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {

				System.out.println("we are now in thread " + Thread.currentThread().getName());
				System.out.println("Current thread priority is " + Thread.currentThread().getPriority());
				throw new RuntimeException("Intentional Exception");
			}
		});
		thread.setName("Misbehaving thread");

		thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {

			@Override
			public void uncaughtException(Thread t, Throwable e) {
				System.out.println(t.getName() + "," + e.getMessage());
			}
		});
		thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are in thread: " + Thread.currentThread().getName()+ " before starting a new thread");
        thread.start();
        System.out.println("We are in thread: " + Thread.currentThread().getName()+ " after starting a new thread");

	}

}
