package com.ashwini.customerService.model;

public class Customer {
	
	final String name;
	final String taxId;
	final String address;
	final String countryCode;
	
	public Customer(String name, String taxId, String address, String countryCode){
		this.name = name;
		this.taxId = taxId;
		this.address = address;
		this.countryCode = countryCode;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", taxId=" + taxId + ", address="
				+ address + ", countryCode=" + countryCode + "]";
	}
	

}
