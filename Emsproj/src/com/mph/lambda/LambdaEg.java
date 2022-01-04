package com.mph.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LambdaEg {
	public static void main(String[] args) {
/*		//java 7 syntax 1
		Task task = new Task();
		task.connect();
		//java 7 syntax 2
		Runnable r = new MyTaskThread();
		Thread thread =new Thread(r);
		thread.start();
		//java 7 syntax 3
		Runnable rn = new Runnable(){
		public void run() {
			Task task = new Task();
			task.connect();
		}
		};
		Thread t1=new Thread(rn);
		t1.start();
*/
		
/*		//java 8 syntax 1
		Runnable r = () -> {
			Task task = new Task();
			task.connect();
		};
		Thread t1 = new Thread(r);
		t1.start();
		//java 8 syntax 2
		Thread th1 = new Thread (() -> {
			Task task = new Task();
			task.connect();
		});
		th1.start();
		//java 8 syntax 3
		new Thread(() -> {
			Task task = new Task();
			task.connect();
		}).start();
		//java 8 syntax 4
		new Thread(() -> {
			new Task().connect();
		}).start();
		//Method Reference java 8 syntax 5
		new Thread(new Task()::connect).start();
*/
		User u1 = new User(10,"Prajwal","prajwal@gmail.com");
		User u2 = new User(20,"Pavan","pavan@gmail.com");
		User u3 = new User(30,"Mahesh","mahesh@gmail.com");
	
		List<User> li= new ArrayList<User>();
		li.add(u1);
		li.add(u2);
		li.add(u3);
		System.out.println("User List :" + li);
		
/*		Iterator<User> i = li.iterator();
		{while(i.hasNext()) {
				System.out.println(i.next());
			}
		}
*/		
		li.forEach(lis->System.out.println(lis));
	
	}
}
