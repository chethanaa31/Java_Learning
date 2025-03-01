package day8;

public class Reverse_String {

	public static void main(String[] args) {
		/*String a = "welcome", b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b); */
		
		
		//Approach 1 - without using string methods.
	/*	String a = "welcome", b="";
		char s[]=a.toCharArray();
		for(int i=a.length()-1;i>=0;i--) {
			b=b+s[i];
		}
		System.out.println(b); */
		
		//Approach 2 - using StringBuffer class
		/* StringBuffer s=new StringBuffer("Welcome");
		System.out.println("Reverse string is: "+ s.reverse()); */
		
		//Approach 3 - using StringBuilder class
		/*StringBuilder s=new StringBuilder("Welcome");
		System.out.println("Reverse string is: "+ s.reverse()); */
		
	}

}
