package com.tnsif.multithread;

public class Tsynch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example t=new example();
		Tea t1=new Tea(t);
		Tea t2=new Tea(t);
		Tea t3=new Tea(t);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}

}
