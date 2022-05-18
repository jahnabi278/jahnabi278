package com.demo.queue;

public class Consumer {
	RoundRobinScheduler roundRobin;

	public Consumer(RoundRobinScheduler roundRobin) {
		this.roundRobin = roundRobin;
	}

	public void dequeue() throws InterruptedException {

		for (int i = 5; i > 0; i++) {
			Thread.sleep(1000);
			Integer value = roundRobin.dequeue();
			System.out.println("Remove value is: " + value);
		}
	}

}
