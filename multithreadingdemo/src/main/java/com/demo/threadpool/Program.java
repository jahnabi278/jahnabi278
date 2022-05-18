package com.demo.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Program {

	public static void main(String[] args) throws InterruptedException {
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		for(int i =0; i<10; i++) 
		{
			Runnable runnable = new WorkerThread("MyWorkerThreads : " +i);
			executorService.execute(runnable);
			//executorService.submit(runnable);
			Thread.sleep(2000);
		}
		executorService.shutdown();
		while(!executorService.isTerminated()) {}
		System.out.println("All requests completed successfully");
	}

}
