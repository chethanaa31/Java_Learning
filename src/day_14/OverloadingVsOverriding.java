/*
---> Method Overriding:
		* Possible only in multiple classes(inheritance).
		* We should not change the signature of the method but body should be changed.
		* Method names are same
		* Belongs to Inheritance

---> Method Overloading:
		* Possible in single & multiple classes (inheritance).
		* We should change the signature of the method.
		* Method names are same.
		* Belongs to polymorphism.
 */




package day_14;

class ABC
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}

}

class XYZ extends ABC
{
	void m1(int a) //overriding
	{
		System.out.println(a*a);
	}
	
	void m2(int a,int b) //overloading
	{
		System.out.println(a+b);
	}

}

public class OverloadingVsOverriding {

	public static void main(String[] args) {
		XYZ xyz=new XYZ();
		xyz.m1(100);
		xyz.m2(200);
		xyz.m2(300,700);
		

	}

}
