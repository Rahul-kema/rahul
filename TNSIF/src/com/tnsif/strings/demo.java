package com.tnsif.strings;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="sachin";
		String str2=str1;
		String str3=str1;
		System.out.println("before modification");
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
		str1 ="tendulkar";
		System.out.println("after modification");
		
		System.out.println("str1 : "+str1);
		System.out.println("str2 : "+str2);
		System.out.println("str3 : "+str3);
		
	}

}
