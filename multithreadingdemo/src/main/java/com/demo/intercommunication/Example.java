package com.demo.intercommunication;

public class Example {
	int num;
	boolean valueSet = false;

	public synchronized void getNum() {
		while(!valueSet) 
		{
			try {wait();} catch (InterruptedException e) {e.getMessage();}
		}
		System.out.println("Get: "+num);
		valueSet = false;
		notify();
	}

	public synchronized void setNum(int num) {
		while(valueSet) 
		{
			try {wait();} catch (InterruptedException e) {e.getMessage();}
		}
		System.out.println("Set: " + num);
		this.num = num;
		valueSet = true;
		notify();
	}
}
