package com.tnsif.Abstract;
//to demonstrate the abstraction
public abstract class Shape {

	protected float area;
	//abstract method
	abstract void calarea();
	
	void show()
	{
		System.out.println("area of shape:"+area);
	}
	
}
