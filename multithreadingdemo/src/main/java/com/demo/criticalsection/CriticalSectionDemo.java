package com.demo.criticalsection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CriticalSectionDemo {
	private Object lock1 = new Object();
	private Random random = new Random();
	private List<Integer> list = new ArrayList<Integer>();

	private void putList() {
		synchronized(lock1) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.getMessage();
			}
			list.add(random.nextInt(100));
		}
	}

	public void process1() {
		putList();

	}

	public void process2() {
		for (int i = 0; i < 100; i++) {
			putList();
			putList();
		}
		System.out.println(Thread.currentThread().getName() + " Final List:" + list);
		System.out.println(list.size());
	}

}
