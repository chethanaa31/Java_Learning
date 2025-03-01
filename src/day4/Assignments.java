package day4;

public class Assignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Reverse a number
		 * Find the number is palindrome or not
		 * count number of digits in a number
		 * count number of even and odd digits in number
		 * find sum of digits in a number
		 */
		
		//Reversing Number - while loop
		int num=1234, reverse=0;
		while(num!=0) {
			int digit=num%10;
			reverse=reverse*10+digit;
			num/=10;
		}
		System.out.println(reverse);
		
		//Reversing Number - for loop
		int i=12345,b=0;
		for(;i!=0;i/=10) {
			int a=i%10;
			b=b*10+a;
		}
		System.out.println(b);
		
		//Reverse a string
		String original="Hello World!";
		String reversed="";
		for(int c=original.length()-1;c>=0;c--) {
			reversed=reversed+original.charAt(c);
		}
		System.out.println(reversed);
		
		//Palindrome or not
		int d=121, e=0, original_num=121;
		for(;d!=0;d/=10) {
			int f=d%10;
			e=e*10+f;
		}
		
		if(original_num==e) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
		
		//Count the number of digits in number
		int g=123490656, counter=0;
		for(;g!=0;g/=10) {
			counter++;
		}
		System.out.println(counter);
		
		//Count number of even and odd digits in a number
		int number=1256789, even_count=0, odd_count=0;
		for(;number!=0;number/=10) {
			int last_num=number%10;
			if(last_num%2==0) {
				even_count++;
			}
			else {
				odd_count++;
			}
		}
		System.out.println("Even: "+ even_count);
		System.out.println("Odd: "+ odd_count);
		
		//Find sum of digits
		int h=6789065, sum=0;
		for(;h!=0;h/=10) {
			int reminder=h%10;
			sum+=reminder;
		}
		System.out.println(sum);
	}

}
