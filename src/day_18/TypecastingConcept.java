package day_18;

/*
 *  Upcasting - Converting value from smaller ---> larger.
 		int -->long
 		float --> double
  
 *  Downcasting - Converting value from larger ---> smaller.
 		long-->int
 		double-->float
 */


public class TypecastingConcept {

	public static void main(String[] args) {
		// Upcasting - automatic
		/* int intvalue=100;
		long longvalue=intvalue;
		System.out.println(longvalue);
		
		float floatvalue=10.5F;
		double doublevalue=floatvalue; */
		
		//Downcasting - manually
		long longvalue=10000;
		int intvalue=(int)longvalue;
		
		double doubleval=1255.88;
		float floatvalue=(float) doubleval;
		
		//example-1
		int i=100;
		double d=i; //upcasting
		System.out.println(d); //100.0
		
		//example-2
		double dval=10.5; 
		int j=(int) dval; //downcasting
		System.out.println(j); //10

	}

}
