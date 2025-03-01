package day8;

public class String_Comparision {

	public static void main(String[] args) {
		String s1="welcome", s2="welcome";
		System.out.println(s1==s2); //true
		System.out.println(s1.equals(s2)); //true
		
		//Case1
		String a=new String("welcome");
		String b=new String("welcome");
		System.out.println(a==b); //false //to compare the objects
		System.out.println(a.equals(b)); //true //to compare the values of objects.
		
		//Case2
		String c1="abc";
		String c2=new String("abc");
		System.out.println(c1==c2); //false
		System.out.println(c1.equals(c2)); //true
		
		//Case3
		String d1="abc";
		String d2=new String("abc");
		String d3=d2;
		System.out.println(d1==d2); //false
		System.out.println(d1.equals(d2)); //true
		
		System.out.println(d2==d3); //true. bcoz objects are same/equal
		System.out.println(d2.equals(d3)); //true
		
		System.out.println(d1==d3); //false
		System.out.println(d1.equals(d3)); //true
	}

}
