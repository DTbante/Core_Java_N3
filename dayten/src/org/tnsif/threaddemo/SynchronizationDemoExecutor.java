package org.tnsif.threaddemo;
//program to demonstrate synchronized method
//driver class
public class SynchronizationDemoExecutor {

	public static void main(String[] args) {
		SynchronizationDemo obj = new SynchronizationDemo();
		ThreadOne t1 = new ThreadOne(obj);
		ThreadTwo t2 = new ThreadTwo(obj);
		t1.start();
		t2.start();
	}

}
