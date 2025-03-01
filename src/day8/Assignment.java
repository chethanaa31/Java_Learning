package day8;

public class Assignment {

	public static void main(String[] args) {
		/*
		 * Check the string is palindrome or not
		 * remove junk or special characters in string
		 * remove white spaces in string
		 * count occurances of a character in a string
		 * count words in a string
		 */
		
		//Check the string is palindrome or not
		String s1="racecar", s2="",s3="racecar";
		for(int i=s1.length()-1;i>=0;i--) {
			s2=s2+s1.charAt(i);
		}
		if(s2.equals(s3)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		// remove junk or special characters in string
		String a1="jh*fwkj^jhjd%gs#";
		String a2=a1.replaceAll("[*,^,%,#]", "");
		System.out.println(a2);
		
		//remove white spaces in string
		String b1="w   e    l co    me   ";
		String b2=b1.replaceAll(" ", "");
		System.out.println(b2);
		
		//count occurances of a character in a string
		/*String c1="bbbaaaabbbccccccaaaabb";
		char[] c2= {'a','b','c'};
		int count=1;
		for(int i=0;i<c1.length();i++) {
			for(int j=i+1;j<c1.length();j++) {
			if(c2[i]==c2[j]) {
				count++;
			}
		}
			System.out.println(c2[i]+" : "+ count);
		} */
		
		
		//count words in a string
		String d1="Mary had a lamb";
		String[] d2=d1.split(" ");
		int length=d2.length;
		System.out.println(length);
		

	}

}
