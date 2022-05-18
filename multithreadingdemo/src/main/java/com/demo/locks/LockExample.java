package com.demo.locks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LockExample {
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	private Random random = new Random();
	private List<Integer> list1 = new ArrayList<Integer>();
	private List<Integer> list2 = new ArrayList<Integer>();

	private void stageOne() {
		synchronized (lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			list1.add(random.nextInt());
		}
	}

	private void stageTwo() {
		synchronized (lock2) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			list2.add(random.nextInt());
		}

	}

	private void process() {
		for (int i = 0; i < 1000; i++) {
			stageOne();
			stageTwo();
		}
	}

	public void methodMain() {
		System.out.println("Starting......");
		long start = System.currentTimeMillis();
		Thread t1 = new Thread(() -> {
			process();
		});
		Thread t2 = new Thread(() -> {
			process();
		});

		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.getMessage();
		}
		long end = System.currentTimeMillis();
		System.out.println("Time: " + (end - start));
		System.out.println("List: " + list1.size() + "," + list2.size());
	}
}
