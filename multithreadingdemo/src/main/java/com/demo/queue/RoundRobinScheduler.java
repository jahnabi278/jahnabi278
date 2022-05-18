package com.demo.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class RoundRobinScheduler {
	
	BlockingQueue<Integer> queue ;
	public RoundRobinScheduler() {
		this.queue= new ArrayBlockingQueue<Integer>(5);
	}
	public void enqueue(int n) {
		try {
			queue.put(n);
		} catch (InterruptedException e) {
			e.getMessage();
			}
		System.out.println(queue);
	}

	public int dequeue() {
		return queue.remove();
	}
	

}
