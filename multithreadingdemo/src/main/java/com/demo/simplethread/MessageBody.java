package com.demo.simplethread;

public class MessageBody implements Runnable{

	@Override
	public void run() {
		ExampleThreads eThread = new ExampleThreads();
		String employees[] = {"Hrishikesh","Igneta","Nitin","Prashant","Pranjal","Momi","Gopi"};
            try {
                for (int i = 0;i< employees.length;i++) {
                    Thread.sleep(2000);
                    eThread.threadMessage(employees[i]);
                }
            } catch (InterruptedException e) {
            	eThread.threadMessage(e.getMessage());
            }
		
	}
}
