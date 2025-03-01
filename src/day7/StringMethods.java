package day7;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		String s="welcome";
		//String a = new String("Welcome");
		
		//length() - returns length of the string (# of characters)
		int l=s.length();
		System.out.println(l); //7
		System.out.println("welcome".length());
		
		//concat - joining strings
		String a ="Welcome";
		String b ="To Java ";
		String c ="Automation";
		
		System.out.println(a+b); //WelcomeTo Java
		System.out.println(a.concat(b)); //WelcomeTo Java
		
		System.out.println(a+b+c); //WelcomeTo Java Automation
		System.out.println(a.concat(b).concat(c)); //WelcomeTo Java Automation
		System.out.println(a.concat(b+c)); //WelcomeTo Java Automation
		
		System.out.println("Hi"+ "Chethu");
		System.out.println("Hi".concat("Chethu"));
		
		//trim()- remove right and left spaces.
		s="        hi   ";
		System.out.println(s);//print string along with spaces.
		System.out.println(s.length());
		System.out.println(s.trim().length());
		
		//charAt()- returns a character from string based on index. Index starts from 0.
		s="welcome";
		System.out.println(s.charAt(3)); //c
		System.out.println(s.charAt(0)); //w
		
		//contains()- returns true or false.
		System.out.println(s.contains("wel")); //true
		System.out.println(s.contains("come")); //true
		System.out.println(s.contains("Wel")); //false
		
		//equals(), equalsIgnoreCase() - compare strings
		a="welcome1";
		b="welcome1";
		
		System.out.println(a==b); //true
		System.out.println(a.equals(b)); //true
		System.out.println(a.equals("Welcome1")); //false
		System.out.println(a.equalsIgnoreCase("Welcome1")); //true
		
		//replace() - replace single/multiple(sequence) of characters in string.
		s="welcome to selenium java selenium python selenium c#";
		System.out.println(s.replace('e', 'x')); //wxlcomx to sxlxnium java sxlxnium python sxlxnium c#
		System.out.println(s.replace("selenium", "playwright")); //welcome to playwright java playwright python playwright c#
		
		
		//substring() - extract substring from the main string
		s="Selenium";
		System.out.println(s.substring(1,5)); //elen
		System.out.println(s.substring(0,3)); //Sel
		
		//toUpperCase() , toLowerCase()
		System.out.println(s.toUpperCase()); //SELENIUM
		System.out.println(s.toLowerCase()); //selenium
		
		//split() - split the string into multiple parts based on delimeter.
		s="abc123@gmail.com";
		String e[]=s.split("@");
		System.out.println(e[0]); //abc123
		System.out.println(e[1]); //gmail.com
		System.out.println(Arrays.toString(e)); //[abc123, gmail.com]
		
		//ex1
		String amount="$15,90,87";
		amount.replace("$", ""); //15,90,87
		System.out.println(amount.replace("$", "").replace(",",""));//159087
		
		//ex2
		s="abc,123@xyz";
		String arr[]=s.split(",");
		System.out.println(Arrays.toString(arr)); //[abc, 123@xyz]
		
		String arr1[]=arr[1].split("@");
		System.out.println(Arrays.toString(arr1)); //[123, xyz]
		
		System.out.println(arr[0] + arr1[0] + arr1[1]); //abc123xyz
		
		// cannot be used as delimeters - * % ^ & ( )
		
		//ex3
		String name="John Kenedy";
		System.out.println(name.replace('J', 'j').contains("john")); //true
		System.out.println(name.toLowerCase().contains("john")); //true
		
		

	}

}
