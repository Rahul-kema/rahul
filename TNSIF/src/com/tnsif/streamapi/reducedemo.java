package com.tnsif.streamapi;

import java.util.Arrays;
import java.util.List;

//to demonstrate reduce program
public class reducedemo {
public static void main(String[] args) {
	List<Integer> num=Arrays.asList(1,2,3,4,5);
	
	int sum=num.stream().reduce(0, (a,b)->a+b);
	System.out.println("sum ="+sum);
}
}
