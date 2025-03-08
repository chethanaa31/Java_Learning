/*

---> Abstraction - Process of hiding the implementation details and showing only functionality to the user.

---> Can attain abstraction from:
		* Abstract class
		* Interface

----> Interface: A blue print of class.
		* Interface contains final & static variables.
		* Interface contains abstract methods (allows default methods & static methods from java8 onwards)
		* Abstract method contains signature but not body (Un-implemented method)
		* Method Interface is public.
		* Interface supports the functionality of multiple inheritance.
		* Can define interface with interface keyword.
		* A class extends another class, an interface extends another interface but a class implements an interface.
		* We can create object reference for interface but we cannot instantiate interface.


 */


package day_15;

interface Shape
{
	int length=10; //final & static
	int width=20; //final & static
	
	void circle(); //abstract method
	
	default void square()
	{
		System.out.println("This is a square!");
	}
	
	static void rectangle()
	{
		System.out.println("This is a rectangle!");
	}
}

public class Data_Abstraction implements Shape {
	
	public void circle()
	{
		System.out.println("This is a circle!");
	}
	
	int x=100, y=200;
	

	public static void main(String[] args) {
		
		//Scenario 1
		Data_Abstraction aobj=new Data_Abstraction();
		aobj.circle(); //abstract
		aobj.square(); //default
		Shape.rectangle(); //static method can directly access from interface
		System.out.println(aobj.x+aobj.y);
		
		//Scenario 2
		Shape sh=new Data_Abstraction();
		sh.circle();
		sh.square();
		Shape.rectangle();
		
		System.out.println(Shape.length+Shape.width);//accessing static variables directly.
		//System.out.println(sh.x+sh.y); //cannot access
	}

}
