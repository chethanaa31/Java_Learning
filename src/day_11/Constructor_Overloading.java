package day_11;

public class Constructor_Overloading {
	
	double width, height,depth;
	Constructor_Overloading() //1
	{
		width=height=depth=0;
	}

	Constructor_Overloading(double w, double h, double d) //2
	{
		width=w;
		height=h;
		depth=d;
	}
	
	Constructor_Overloading(double len) //3
	{
		width=height=depth=len;
	}
	
	double volume()
	{
		return(width*height*depth);
	}
}
