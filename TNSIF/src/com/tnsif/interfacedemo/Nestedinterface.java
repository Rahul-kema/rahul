package com.tnsif.interfacedemo;

import tnsif.interfacedemo.Myinterface;

public class Nestedinterface implements Myinterface.Myinnerinterface{

	@Override
	public void print() {
		System.out.println("welcome to inner interface");
		
	}

}
