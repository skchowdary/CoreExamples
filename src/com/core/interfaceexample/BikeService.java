package com.core.interfaceexample;

public class BikeService implements Vehicles
{
	@Override
	public String beforeService()
	{
		return "Total 38 bikes came for service on DD/MM/YYYY";
	}
	
	@Override
	public String afterService() 
	{
		return "Total 8 bikes are serviced on DD/MM/YYYY";
	}
}
