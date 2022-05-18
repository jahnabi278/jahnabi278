package com.demo.queue;

import java.util.Random;

public class Producer {
	RoundRobinScheduler roundRobin;

	public Producer(RoundRobinScheduler roundRobin) {
		this.roundRobin = roundRobin;
	}

	Random random = new Random();

	public void enqueue() throws InterruptedException {
		for (int i = 0; i < 5; i++) {
			roundRobin.enqueue(random.nextInt(100));
		}

	}

}
