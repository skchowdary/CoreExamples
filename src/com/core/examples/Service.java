/*This Example Will Be Taken For Loose and Tight Coupling*/
package com.core.examples;

class MostSuper
{
	int i = 10,j = 10;
	String s1 = "Hai";
	public void display()
	{
		System.out.println(i++ + --i + i-- + i++);
		System.out.println(j-- + j++ + --j + --j + j++ + ++j);
		System.out.println(s1);
		System.out.println("---------------------------------");
	}
}

class SubSuper
{
	float k = 20, l = 20;
	boolean flag = true;
	public void display1()
	{
		System.out.println(k++ + --k + k-- + k++ + ++k);
		System.out.println(++l + l-- + l++ + l-- + --l);
		System.out.println(flag);

	}
}

public class Service extends SubSuper
{
	public static void main(String[] args)
	{
		Service ser = new Service();
		new MostSuper().display();
		ser.display1();
	}
}
