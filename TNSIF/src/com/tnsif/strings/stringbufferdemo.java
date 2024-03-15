package com.tnsif.strings;

public class stringbufferdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       StringBuffer b=new StringBuffer("welcome ");
       b.append("welcome to java");
       System.out.println(b);
       
       b.insert(2, "hi");
       System.out.println(b);
       
       b.replace(1, 4, "word");
       System.out.println(b);
       
       b.delete(0,3);
       System.out.println(b);
       
       b.reverse();
       System.out.println(b);
	}

}
