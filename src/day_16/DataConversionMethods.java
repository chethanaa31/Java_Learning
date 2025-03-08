package day_16;

public class DataConversionMethods {

	public static void main(String[] args) {
		
		//String to int
		//String s="welcome";
		//int sint= Integer.parseInt(s); //cannot convert to int because s is a word.
		
		String s1="10", s2="20";
		System.out.println(Integer.parseInt(s1)+ Integer.parseInt(s2));
		
		//String to Double
		String a1="10.8", a2="32.5";
		System.out.println(Double.parseDouble(a1)+Double.parseDouble(a2));
		
		//String to Boolean
		String s="true"; //other than true, if you pass any string it will return false.
		System.out.println(Boolean.parseBoolean(s));
		
		//int, double, bool, char ---> String
		int a=10;
		double b=10.7;
		char c='A';
		boolean bool=true;
		
		String sout=String.valueOf(a);
		System.out.println(sout);
		
		sout=String.valueOf(b);
		System.out.println(sout);
		
		sout=String.valueOf(c);
		System.out.println(sout);
		
		sout=String.valueOf(bool);
		System.out.println(sout);
		
		/*
		 	ArrayList arr=new ArrayList();
		 	ArrayList<Integer> arr=new ArrayList<Integer>(); //valid
		 	ArrayList<int> arr=new ArrayList<int>(); //Not valid
		 	
		 */

	}

}
