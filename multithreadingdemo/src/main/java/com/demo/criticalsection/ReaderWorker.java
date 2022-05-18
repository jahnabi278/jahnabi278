package com.demo.criticalsection;

public class ReaderWorker implements Runnable {
	CriticalSectionDemo demo = new CriticalSectionDemo();

	public void run() {
		demo.process2();
	}

}
