/*
 * Operator --> symbol which will perform an operation.
 */

package day2;

public class Operators {

	public static void main(String[] args) {
		
		// Arithmetic operators: + - */ %
		int a=20, b=10;
		System.out.println("Sum is: "+(a+b));
		System.out.println("Difference is: "+(a-b));
		System.out.println("Multiplication is: "+(a*b));
		System.out.println("Division is: "+(a/b));
		System.out.println("Reminder is: "+(a%b));
		
		// Relational/Comparison operators > >= < <= != ==
		//returns boolean value - true/false
		System.out.println(a>b); //true
		System.out.println(a>=b); //true
		System.out.println(a<b); //false
		System.out.println(a<=b); //false
		System.out.println(a!=b); //true
		System.out.println(a==b); //false
		
		//Logical Operators && || !
		//returns boolean value - true/false
		boolean x=true, y=false;
		System.out.println(x&&y); //false
		System.out.println(x||y); //true
		System.out.println(!x); //false
		System.out.println(!y); //true
		
		boolean b1=10>20;
		boolean b2=20>10;
		System.out.println(b1&&b2); //false
		System.out.println(b1||b2); //true
		
		System.out.println((10<20)&&(10>20)); //false
		
		//Incremental & Decrement Operators ++ --
		int c=10;
		c++;
		System.out.println(c); //11
		
		int d=10;
		int res=d++;
		System.out.println(res);//10 ; because d value is directly assigned to res. --> post increment.
		System.out.println(d);//11
		
		int e=10;
		int result=++e;
		System.out.println(result);//11 ; pre increment.
		
		//Decrement
		int f=10;
		f--;
		System.out.println(f); //9
		
		int g=10;
		int re=g--;
		System.out.println(re);//10 ; because g value is directly assigned to re. --> post decrement.
		System.out.println(g);//9
		
		int h=10;
		int result1=--h;
		System.out.println(result1);//11 ; pre decrement.
		
		//Assignment Operators = += -= *= /= %=
		int i =10;
		/*i+=5;
		System.out.println(i); //15
		
		i-=5;
		System.out.println(i); //5
		
		i*=2;
		System.out.println(i); //20 
		
		
		i/=5;
		System.out.println(i); //2 */
		
		i%=5;
		System.out.println(i); //0
		
		//Conditional/Ternary operator
		//var = exp ? result1:result2;
		int j=100, k=200;
		int l=(k>j)? k:j;
		System.out.println(l); //200
		
		int m=(1==1)?100:200;
		System.out.println(m); //100
		
		int n=(1==2)?100:200;
		System.out.println(n); //200
		
		int age=30;
		String result2=(age>=18)?"Eligible":"Not Eligible";
		System.out.println(result2);
		
		/*
		 * Unary operators ++ -- += -= /= *= %= !
		 * Binary operators + - * % / && || > >= < <= != ==
		 * Ternary operators ?
		 */
		
		//Swapping of numbers
		int o=20,p=10;
		o=o+p;//30
		p=o-p;//20
		o=o-p;//10
		System.out.println(o);
		System.out.println(p);
		

	}

}
