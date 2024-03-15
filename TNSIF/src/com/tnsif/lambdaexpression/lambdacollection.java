package com.tnsif.lambdaexpression;
import java.util.ArrayList;
//to demonstrate lambda expressions for collections
public class lambdacollection {
public static void main(String[] args) {
	ArrayList<Integer> li=new ArrayList<Integer> ();
	li.add(2);
	li.add(2);
	
	//using for each loop
	//for(Integer ele:li) {
		//System.out.println(ele);
	//}
	
	//using lambda expression,less code here
	li.forEach(element ->System.out.println(element));
	
}
}
