package com.tnsif.streamapi;

import java.util.stream.Stream;

public class skipexample {
public static void main(String[] args) {
	Stream.of(1,2,3,4,5,6,7,8,9)
	.filter(num->num%2==0)//filter even number
	.skip(2)
     //.forEach(num->System.out.println(num+""));
	.limit(1) //limit will give only one element
	.forEach(num->System.out.println(num+""));
}
}
