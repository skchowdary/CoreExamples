package com.core.examples;

public class LoopsExamples
{
	int i;
	public void print()
	{
		for(i = 1; i <= 20; i++)
		{
			System.out.print(i + " , ");
		}
	}
	public static void main(String[] args)
	{
		LoopsExamples le = new LoopsExamples();
		le.print();
	}
}
