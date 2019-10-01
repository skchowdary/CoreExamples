package com.core.interfaceexample;

public class Service 
{
	public static void main(String[] args) 
	{
		CarService cs = new CarService();
		String c1 = cs.beforeService();
		String c2 = cs.afterService();
		
		BikeService bs = new BikeService();
		String b1 = bs.beforeService();
		String b2 = bs.afterService();
		
		System.out.println("Car Service");
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("------------------------------------");
		
		System.out.println("Bike Service");
		System.out.println(b1);
		System.out.println(b2);
	}

}

