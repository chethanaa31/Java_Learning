package day_12;

public class This_Keyword {
	
	int x,y; // class variables or instance variables.
	
	This_Keyword(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		This_Keyword th=new This_Keyword(100,200);
		th.display();
		

		
	}

}
