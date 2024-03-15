package com.tnsif.streamapi;

import java.util.List;
import java.util.ArrayList;

//to demonstrate consumer program
public class consumerdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> cities = new ArrayList<String>();
cities.add("banglore");
Consumer<String> print=cities->System.out.println();
	}

}
