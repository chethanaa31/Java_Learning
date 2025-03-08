package day_17;

public class FinallyBlock {

	public static void main(String[] args) {
		System.out.println("Program started...");
		String s=null; //NullPointerException
		
		try {
			System.out.println(s.length());
		}
		
		catch(Exception e) {
			System.out.println("Catch block handled exception...");
			System.out.println(e.getMessage());
		}
		
		finally //it will execute even the exception occured or not.
		{
			System.out.println("You entered into finally block...");
		}
		
		
		System.out.println("Program completed..");

	}

}
