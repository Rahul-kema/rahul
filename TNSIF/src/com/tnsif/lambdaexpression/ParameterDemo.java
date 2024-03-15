package com.tnsif.lambdaexpression;
//lambda with parameter demo
public class ParameterDemo {
public static void main(String[] args) {
	Cube c=(a)->{return (a*a*a);};
	System.out.println("cube of the number is:"+c.calculate(3));
	Square s=(x)->{return(x*x);};
	System.out.println("square os the number is:"+s.calculate(5));
}
}
