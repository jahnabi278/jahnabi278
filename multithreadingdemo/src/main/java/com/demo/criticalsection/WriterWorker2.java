package com.demo.criticalsection;

public class WriterWorker2 implements Runnable {
	CriticalSectionDemo demo = new CriticalSectionDemo();

	public void run() {
		for (int i = 0; i < 100; i++) {
			demo.process1();
		}
		System.out.println(Thread.currentThread().getName() +" 100 Elements added to the list");
	}

}
