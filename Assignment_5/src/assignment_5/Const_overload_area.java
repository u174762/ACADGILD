package assignment_5;

// This is the solution for assignment problem number 3 i.e. calculate the area of square and rectangle using
// constructor overloading


public class Const_overload_area {

	
	private double side1, side2;
	
	Const_overload_area(double x)
	{
		side1 = x;
		double area_square = x*x;
		
		System.out.println("The area of the square is: "+area_square);
		
	}
	
	Const_overload_area(double x, double y)
	{
		side1=x; side2=y;
		
		double _area_rect = x*y;
		System.out.println("The area of the rectangle is: "+_area_rect);
	}
	
	
	
	
	
	
}
