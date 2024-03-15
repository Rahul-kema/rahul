package com.tnsif.multithread;

public class extendingthread extends Thread{

	public void run()                       //running state
	{
		System.out.println("welcome2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
extendingthread e =new extendingthread();
e.start();                                  //runnable state

	}

}
