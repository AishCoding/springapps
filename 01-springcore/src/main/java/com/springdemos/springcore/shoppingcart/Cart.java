package com.springdemos.springcore.shoppingcart;

public class Cart {

	private Items item;

	public Items getItem() {
		return item;
	}

	public void setItem(Items item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Cart [item=" + item + "]";
	}
}
