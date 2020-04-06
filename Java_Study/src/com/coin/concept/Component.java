package com.coin.concept;

/**
 * Component 閫昏緫閮ㄤ欢鐨勫畾涔�
 * @author Tom
 *
 */
public abstract class Component {
	
	private double price; //价格
	private String name;
	
	public Component(String name, double price) {
		this.price = price;
		this.name = name;
	}
	
	public String description() {
		StringBuilder descriptionBuilder = new StringBuilder();
		descriptionBuilder.append("Name:{")
			.append(name)
			.append("}; Price:{")
			.append(price)
			.append("};");
		return descriptionBuilder.toString();
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
