/*This code covers 3rd and 4th question of my questions*/

package com.core.examples;

class Parent
{
	int sum, sub;
	float multi, div;
	Parent()
	{
		System.out.println("This is parent class constructor with no arg");
		System.out.println("-----------------------------------------");
	}
	Parent(int i, int j)
	{
		this();
		sum = i + j;
		sub = i - j;
		multi = i * j;
		div = i/j;
		System.out.println("Sum=" + sum + " , " + "Sub=" + sub + " , "
		+ "Multi=" + multi +" , " +  "Div=" + div);
		System.out.println("-----------------------------------------");
		
	}
	Parent(String s1, Double d1)
	{
		this(20, 10);
		System.out.println(s1 + " , " + d1);
		System.out.println("-----------------------------------------");
	}
}
public class Child extends Parent
{
	Child()
	{
		super("Hello", 10.0);
		System.out.println("All The Constructor of Super Class Has Been Executed"
							+ " With Child Class Object");
		System.out.println("-----------------------------------------");
	}
	
	public String display()
	{
		return "All Working Fine";
	}

	public static void main(String[] args)
	{
		Child ch = new Child();
		System.out.println(ch.display());
		System.out.println("-----------------------------------------");
		System.out.println("End Of Execution");
	}
}
