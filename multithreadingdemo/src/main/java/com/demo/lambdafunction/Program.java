package com.demo.lambdafunction;

public class Program {
public static void main(String args[]) throws InterruptedException {
	Thread hello = new Hello();
	Thread hi = new Hi();
	hello.start();
	hello.sleep(10);
	hi.start();
}
}
