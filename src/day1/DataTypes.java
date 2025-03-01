package day1;

public class DataTypes {

	public static void main(String[] args) {
		/* 
		 * DataType--> Represents type of data.
		 
		 	1) Primitive Datatypes --> we can save single values.
		 		* byte,short,int,long --> number without decimal.
		 		* float,double --> decimal number.
		 		* char --> single character (single quote)
		 		* boolean --> true/false
		 	
		 	
		 	2) Non-Premitive/ Derived/collections --> we can save multiple values.
		 		*String
		 		*arrayList
		 		*HashMap
		 		*HashSet etc..
		 
		 * Java --> Statically typed programming language.
		 		* if a variable is declared with one data-type, we cannot store the value of another data-type.
		 			int x=100;
		 			x="welcome"; //invalid
		 		
		 		
		 * Python --> Dynamically typed programming language. 
		 		*no need to specify data-type.
		 			x=100;
		 			x="Welcome"; //valid
		 */
		
		//Numeric data-types;
		int a=100, b=200;
		System.out.println(a+ " "+b);
		System.out.println("Sum is: " + (a+b));
		
		byte c=125;
		System.out.println(c);
		
		short sh=3535;
		System.out.println(sh);
		
		long l=284975432843L; //literal 'L' is needed.
		System.out.println(l);
		
		
		//Decimal numbers - float, double.
		float item_price=15.66F; //literal 'F' is needed.
		System.out.println(item_price);
		
		double dbl=1234.67789;
		System.out.println(dbl);
		
		//Alphabetical
		char grad='A';
		System.out.println(grad);
		
		String name="John";
		System.out.println(name);
		
	/*	char ch='ABC'; //invalid
		String ch='ABC'; //invalid
		String ch='A'; //invalid
		String ch="A"; //valid   */
		
		//Boolean
		boolean bl=false; //allows only true/false
		System.out.println(bl);
		
	/*	boolean boo="true"; //invalid
		boolean boo="false"; //invalid
		String boo=true; //invalid
		String al ="true"; //valid */
		
		//const or final --> to make the variable constant, we cannot change the value
		final int num=100;
		
		
		
		

	}

}
