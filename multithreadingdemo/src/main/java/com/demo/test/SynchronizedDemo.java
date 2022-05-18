package com.demo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SynchronizedDemo {
	private Object lock = new Object();
	private Random random = new Random();
	private List<Integer> list = new ArrayList<Integer>();

	private void putData() {
		synchronized (lock) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			list.add(random.nextInt());
		}
	}

	private void process() {
		for (int i = 0; i < 1000; i++) {
			putData();
		}
		System.out.println(Thread.currentThread().getName()+" List:"+ list.size());
	}

	public void methodMain() throws InterruptedException {
		System.out.println("Starting......");
		Thread t1 = new Thread(() -> {
			process();
		});
		t1.setName("First Thread:");
		Thread t2 = new Thread(() -> {
			process();
		});
		t2.setName("Second Thread:");
		Thread t3 = new Thread(() -> {
			process();
		});
		t3.setName("Third Thread:");
		Thread t4 = new Thread(() -> {
			process();
		});
		t4.setName("Fourth Thread:");
		Thread t5 = new Thread(() -> {
			process();
		});
		t5.setName("Fifth Thread:");


		t1.start(); t1.join();
		t2.start(); t2.join();
		t3.start();	t3.join();
		t4.start(); t4.join();
		t5.start(); t5.join();
		System.out.println("Final List: " + list.size());
	}

}
