package com.tnsif.interfacedemo;

import tnsif.interfacedemo.Bank;

public class SBI implements Bank {

	@Override
	public float rateofinterest() {
		
		return 9.15f;
	}
}