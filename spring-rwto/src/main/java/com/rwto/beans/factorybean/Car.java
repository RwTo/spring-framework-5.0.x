package com.rwto.beans.factorybean;

/**
 * @author renmw
 * @create 2023/9/6 14:22
 **/
public class Car {
	private String name;
	private String price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car{" +
				"name='" + name + '\'' +
				", price='" + price + '\'' +
				'}';
	}
}
