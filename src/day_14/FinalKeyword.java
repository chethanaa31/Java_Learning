/*
---> Final - variables, methods, class
		* Variables - We cannot change the value of variable (constant)
		* Methods - We cannot override those methods in child classes. 
		* Class - We cannot extend the class.
 */


package day_14;

class Test
{
	final int x=100;

}

public class FinalKeyword {

	public static void main(String[] args) {
		Test t=new Test();
		//t.x=200; //incorrect, x is final variable.
		System.out.println(t.x);

	}

}
