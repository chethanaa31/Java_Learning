package day8;

public class String_StringBuffer_StringBuilder {

	public static void main(String[] args) {
		
		//String - immutable
		String s="welcome";
		s.concat(" to java");
		System.out.println(s); //immutable, cannot change original value of s.
		
		//StringBuffer - mutable
		StringBuffer sbr=new StringBuffer("welcome");
		sbr.append(" to java");
		System.out.println(sbr); //welcome to java //mutable, can change original value of s.

		//StringBuffer - mutable
		StringBuilder sb=new StringBuilder("welcome");
		sb.append(" to java");
		System.out.println(sb); //welcome to java //mutable, can change original value of s.


	}

}
