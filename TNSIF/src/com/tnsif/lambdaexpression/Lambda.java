package com.tnsif.lambdaexpression;
//lambda without parameter
public class Lambda {
public static void main(String[] args) {
	Message m=()->{return "hello";};
	System.out.println(m.greet());
}
}
