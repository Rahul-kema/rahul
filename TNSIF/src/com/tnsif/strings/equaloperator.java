package com.tnsif.strings;

public class equaloperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1="sachin";
	      String s2="sachin";
	      String s3 = new String ("sachin"); //s3 refers to instance created in non pool
	      System.out.println(s1==s2);
	      System.out.println(s1==s3);
	      
	}

}
