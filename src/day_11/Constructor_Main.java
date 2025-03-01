package day_11;

public class Constructor_Main {

	public static void main(String[] args) {
		//Constructor_Overloading b=new Constructor_Overloading(); //1
		//Constructor_Overloading b=new Constructor_Overloading(10.5, 6.8, 9.5); //2
		Constructor_Overloading b=new Constructor_Overloading(10.5); //3
		
		System.out.println(b.volume());
		
		

	}

}
