package com.tnsif.Abstract;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Square s=new Square();no need
//System.out.println(s);no need
//Shape h=new Shape();error bcz shape is abstract class we cannot create obj
Shape h=new Square();
h.calarea();
h.show();
	}

}
