package day_12;

public class StaticMain {

	public static void main(String[] args) {
		//static methods can access static stuff directly (without object)
				System.out.println(StaticDemo.a);
				StaticDemo.m1(); 
				
		//static methods can access non-static stuff through object.
				StaticDemo sd=new StaticDemo();
				System.out.println(sd.b);
				sd.m2();
				sd.m();

	}

}
