package com.demo.intercommunication;

public class Program {

	public static void main(String[] args) {
        Example example = new Example();
        new Producer(example);
        new Consumer(example);
	}

}
