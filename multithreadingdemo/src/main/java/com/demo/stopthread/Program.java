package com.demo.stopthread;

public class Program {
	public static void main(String args[]) throws InterruptedException {
		StopThreadDemo demo = new StopThreadDemo();
		demo.start();
		//Thread.sleep(3000);
		demo.join(3000);
//		if(demo.isAlive()) 
//		{
//			demo.setShouldExit(true);
//			try {demo.join();} catch (InterruptedException e) {e.getMessage();}
//		}
		System.exit(0);
	}

}
