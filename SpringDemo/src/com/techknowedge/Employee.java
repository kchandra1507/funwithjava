package com.techknowedge;
import java.util.*;
public class Employee {
Employee(){
}
private String name;
private int id;
private Address address;
private List<Departments> departments;
public int getId()
{
return id;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public void setId(int id)
{
	this.id=id;
}
Employee(String name,int id, Address address, List<Departments> departments)
{
	this.name=name;
	this.id=id;
	this.address=address;
	this.departments=departments;
}
Employee(int id)
{
	this.id=id;
}
Employee(Address address,List<Departments> departments)
{
	this.address=address;
	this.departments=departments;
}
public void displayInfo()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println(address);
	Iterator<Departments> dpt=departments.iterator();
	while(dpt.hasNext())
	{
		System.out.println(dpt.next());
	}
}
}

