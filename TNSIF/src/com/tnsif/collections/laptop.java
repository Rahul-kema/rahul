package com.tnsif.collections;

@SuppressWarnings("rawtypes")
public class laptop implements Comparable<laptop>{
private String brand;
private int price;
private int ram;

	public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

public int getRam() {
	return ram;
}

public void setRam(int ram) {
	this.ram = ram;
}

	public laptop(String brand, int price, int ram) {
	// TODO Auto-generated constructor stub
		super();
		this.brand=brand;
		this.price=price;
		this.ram=ram;
}
	

	@Override
	public String toString() {
		return "laptop [brand=" + brand + ", price=" + price + ", ram=" + ram + "]";
	}

	public int compareTo(laptop o)
	{
		if(this.getPrice()>o.getPrice()) {
			return 1;
		
	}
	else {
		return -1;
	}
}
}


