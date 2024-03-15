package com.tnsif.multithread;

public class implementingRunnable implements Runnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		implementingRunnable r=new implementingRunnable();   //new state
		Thread t=new Thread(r);
		t.start();
		System.out.println(t.getPriority());
		System.out.println(t.getName());
		System.out.println(t.isAlive());
		//r.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hello java");
	}

}
