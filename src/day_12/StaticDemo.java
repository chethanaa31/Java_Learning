package day_12;

public class StaticDemo {
	
	static int a=10; //static variable
	int b=20; //non-static variable
	
	static void m1() //static method
	{
		System.out.println("This is m1 static method..");
	}
	
	void m2() //non-static method
	{
		System.out.println("This is m2 non-static method..");
	}
	
	void m() //non-static method
	{
		
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}

	public static void main(String[] args) {
		
		//static methods can access static stuff directly (without object)
		System.out.println(a);
		m1(); 
		
		//non static methods cannot access non-static stuff directly
		//System.out.println(b);
		//m2(); 
		
		//static methods can access non-static stuff through object.
		/* StaticDemo sd=new StaticDemo();
		System.out.println(sd.b);
		sd.m2(); */
		
		//Non -static methods can access everything directly.
		StaticDemo sd=new StaticDemo();
		sd.m();
		
		

	}

}
