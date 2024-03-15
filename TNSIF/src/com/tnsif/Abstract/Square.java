package com.tnsif.Abstract;

public class Square extends Shape{

	private  float side;
	public Square()
	{
		side=2.0f;
	}
	//public static void main(String[] args) {
		// TODO Auto-generated method stub

	//}
	public Square (float side)
	{
		this.side=side;
	}

	void calarea()
	{
		//@Override
		super.area=side*side;
	}
	
	//to print op,write toString method
	public String toString()
	{
		return "Square[side="+side+"]";
	}
}
