package com.demo.queue;

public class Test {
	public void methodMain() throws InterruptedException {

		RoundRobinScheduler scheduler = new RoundRobinScheduler();
		Producer produce = new Producer(scheduler);
		Consumer consume = new Consumer(scheduler);
		System.out.println("Starting......");
		Thread producerQueue = new Thread(() -> {

			try {
				produce.enqueue();
				Thread.sleep(30);
			} catch (InterruptedException e) {
				e.getMessage();
			}

		});

		Thread consumerQueue = new Thread(() -> {
			try {
				consume.dequeue();

				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.getMessage();
			}

		});
		producerQueue.start();
		producerQueue.join();
		consumerQueue.start();
		consumerQueue.join();
	}
}
