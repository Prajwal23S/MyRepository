package com.mph.lambda;

public class MyTaskThread implements Runnable{
	public void run() {
		Task t = new Task();
		t.connect();
	}
}
