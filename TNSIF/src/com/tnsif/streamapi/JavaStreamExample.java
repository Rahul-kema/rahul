package com.tnsif.streamapi;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
public class JavaStreamExample {
	public static void main(String[] args) {
		List<Product> productlist=new ArrayList<Product>();
		//filtering collection by using stream
		productlist.add(new Product(1,"hp laptop",25000f));
		productlist.add(new Product(2,"mac laptop",45000f));
		productlist.add(new Product(3,"lenovo laptop",35000f));
		productlist.add(new Product(4,"thinkpad laptop",20000f));
		
		
		//List<Float> p2=productlist.stream().filter(p->p.price>30000)//filtering data 
		//.map(p->p.price)//fetching the price
		//.collect(Collectors.toList());//collecting data
		//System.out.println(p2);
	
		//finding sum by using collectors method
		//double totalprice=productlist.stream().collect(Collectors.summingDouble(product->product.price));
	//System.out.println(totalprice);
	
		//finding maximum product list
		//Product p=productlist.stream().max((p1,p2)->p1.price>p2.price?1:-1).get();
	//System.out.println(p.price);
	
	//finding min product price list
		Product p=productlist.stream().min((p1,p2)->p1.price>p2.price?1:-1).get();
	System.out.println(p.price);
	
	//count() method
	long count=productlist.stream().filter(product->product.price<10000).count();
	System.out.println(count);
	
	
	}
	}

