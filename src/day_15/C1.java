/*
--> Abstract Class:
		* can have abstract and non-abstract methods.
		* doesn't support multiple inheritance.
		* Can have final, non-final, static and non-static variables.
		* Can provide the implementation of interface
		* Abstract keyword
		* Abstract class can extend another Java class and implement multiple Java interfaces.
		* Can be extended using a keyword "extends".
		* It can have class members like private, protected etc..,
		* Example:
			public abstract class Shape{
			public abstract void draw();
			}






--> Interface:
		* only abstract methods
		* Supports multiple inheritance.
		* Allows only static and final variables.
		* Cannot provide the implementation of interface
		* Interface keyword
		* Can extend another Java interface only.
		* Can be implemented using keyword "implements"
		* members are public by default.
		* Example:
			public interface Drawable{
			void draw();
			}


 */



package day_15;

public class C1 extends C2 implements I1,I2 {
	
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {
	
		C1 obj=new C1();
		obj.m1();
		obj.m2();
		obj.m3();

	}

}
