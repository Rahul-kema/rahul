package com.tnsif.collections;

public class unboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer a=new Integer(3);
int i=a.intValue();//converting integer to int explicitly
int j=a;    //unboxing ,new compiler will write a.intValue()internally
System.out.println(a+" "+i+" "+j);
	}

}
