package com.demo.sync;

public class Counter {
	int count = 0;

	public synchronized void incrementor() {
		count++;
	}
}
