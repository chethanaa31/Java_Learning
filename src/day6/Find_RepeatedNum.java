package day6;

public class Find_RepeatedNum {

	public static void main(String[] args) {
		int a[]= {100,200,100,300,400,500};
		int num=100, count=0;
		for(int x:a) {
			
			if(x==num) {
				count++;
			}	
		}
		System.out.println(count);

	}

}
