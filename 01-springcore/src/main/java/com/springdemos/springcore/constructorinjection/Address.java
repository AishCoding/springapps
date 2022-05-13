package com.springdemos.springcore.constructorinjection;

public class Address {

	private int housenumber;
	private String city;
	private String street;

	@Override
	public String toString() {
		return "Address [housenumber=" + housenumber + ", city=" + city + ", street=" + street + "]";
	}

	public int getHousenumber() {
		return housenumber;
	}

	public void setHousenumber(int housenumber) {
		this.housenumber = housenumber;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

}
