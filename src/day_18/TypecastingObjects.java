package day_18;

class Parent
{
	String name="John";
	
	void m1() {
		System.out.println("This is m1 from Parent..");
	}
}
	
class child extends Parent
	{
		int id=101;
		
		void m2() {
			System.out.println("This is m2 from Child..");
		}

}

public class TypecastingObjects {

	public static void main(String[] args) {

		/*child c=new child();
		System.out.println(c.name); //Parent
		c.m1(); //Parent
		System.out.println(c.id); //Child
		c.m2(); //Child */
		
	/*	Parent p=new child(); //Upcasting
		System.out.println(p.name);
		p.m1();
		
		System.out.println(p.id); //we cannot access.
		p.m2(); */
		
		Parent p=new Parent();
		child c=(child) p; // we will get run-time error.
		
		System.out.println(c.id);
		System.out.println(c.name);
		c.m1();
		c.m2();

	}

}
