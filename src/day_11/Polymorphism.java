/*
--> Polymorphism - one concept and many forms. Achieved by overloading.

--> Rules:
		* Method names should be same.
		* Number of parameters should be different.
		* Data type of parameters should be different.
		* Order of parameters should be different.
 */


package day_11;

public class Polymorphism {

	int a=10, b=20;
	void sum() //1
	{
		System.out.println(a+b);
	}
	
	void sum(int x, int y) //2
	{
		System.out.println(x+y);
	}
	
	void sum(int x, double y) //3
	{
		System.out.println(x+y);
	}
	
	void sum(double x, int y) //4
	{
		System.out.println(x+y);
	}
	
	void sum(int x, int y, int z) //5
	{
		System.out.println(x+y+z);
	}

}
