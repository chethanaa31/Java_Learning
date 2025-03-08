/*
---> Super Keyword:
		* Used to invoke the immediate parent class variable.
		* Used to invoke the immediate parent class method.
 */


package day_14;

public class SuperKeyword {
	String color="white";
	
	void eat() {
		System.out.println("Eating");
	}
}

class Dog extends SuperKeyword
{
	String color="black";
	
	void displayColor() {
		System.out.println(super.color); //returns immediate parent class value.
	}
	
	void eat() {
		//System.out.println("Eating bread");
		super.eat();
	}
}

	