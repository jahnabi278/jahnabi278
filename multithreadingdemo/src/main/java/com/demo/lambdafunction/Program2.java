package com.demo.lambdafunction;
public class Program2 {
	public static void main(String[] args) throws InterruptedException{
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("Hello");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		},"Hello Thread");
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 5; i++) {
				System.out.println("Hi");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
		},"Hi Thread");
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.getName()+","+t2.getName());
		System.out.println(t1.getPriority()+","+t2.getPriority());
		t1.start();
		System.out.println(t1.isAlive());
		Thread.sleep(10);
		t2.start();
		t1.join();
		t2.join();
		System.out.println(t1.isAlive());
		System.out.println("Bye");
	}

}
