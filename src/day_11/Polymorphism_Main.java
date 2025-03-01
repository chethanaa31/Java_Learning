package day_11;

public class Polymorphism_Main {

	public static void main(String[] args) {
		Polymorphism add=new Polymorphism();
		add.sum(); //1
		add.sum(100, 200); //2
		add.sum(500, 600.8); //3
		add.sum(10.5, 80); //4
		add.sum(45, 60, 100); //5
		

	}

}
