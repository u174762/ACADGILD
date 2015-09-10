package assignment_5;

public class Area {
	
	private double length, breadth, height, base;
	
	public double _calcArea(double x, double y)
	{
		length=x;
		breadth=y;
			double area = length*breadth;
			
			return area;			
		
	}
	
	

}


class Rectangle extends Area
{
	
	public void _rect_area(double side1, double side2)
	{
		double area_rect = _calcArea(side1, side2);
		
		System.out.println("The area of the rectangle is: "+area_rect);
		
	}
	
}

class Triangle extends Area
{
	public void _triangle_area(double base, double height)
	{
		double area_triangle = 0.5*(_calcArea(base, height));
		
		System.out.println("The area of the triangle is: "+area_triangle);
		
	}
}