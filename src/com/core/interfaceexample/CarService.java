package com.core.interfaceexample;


public class CarService implements Vehicles
{
	@Override
	public String beforeService()
	{
		return "Total 10 cars came for service on DD/MM/YYYY";
	}
	
	@Override
	public String afterService() 
	{
		return "Total 7 cars got serviced and delivered on DD/MM/YYYY";
	}

}

