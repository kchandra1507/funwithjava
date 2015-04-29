package com.techknowedge;

public class Address {
private String city;
private String state;
private String countary;
Address(String city,String state, String countary)
{
	this.city=city;
	this.state=state;
	this.countary=countary;
}
public String toString()
{
	return city+ " "+state+" "+countary;
}
}
