package com.techknowedge;

public class Salary {
private int HRA;
private int basic;
//private int gross;
public Salary(int HRA,int basic)
{
super();
this.HRA=HRA;
this.basic=basic;
}
public String  toString()
{
return "salary= "+grossSalary();
}
public int grossSalary()
{
	return HRA+basic;
}
}
