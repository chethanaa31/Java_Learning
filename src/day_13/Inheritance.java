/*
---> Inheritance - Acquiring all the properties(variables) and behaviour(methods) from one class to another class.

---> Objective:
		* Re-usability
		* Avoid duplication

---> Types:
		* Single
		* Multi level
		* Hierarchy
		* Multiple - cannot inherit multiple classes in java.
 */


package day_13;

class A{
	int a=100;
	void display() {
		System.out.println(a);
	}
}

class B extends A{
	int b=200;
	void show() {
		System.out.println(b);
	}
}

class C extends B{
	int c=500;
	void print() {
		System.out.println(c);
	}
}

public class Inheritance {


	public static void main(String[] args) {
		
		//single level
		B bobj=new B();
		System.out.println(bobj.a);
		System.out.println(bobj.b);
		bobj.display();
		bobj.show();
		
		//multi level
		C cobj=new C();
		cobj.a=50;
		cobj.b=700;
		cobj.c=900;
		cobj.display();
		cobj.show();
		cobj.print();
		

	}

}
