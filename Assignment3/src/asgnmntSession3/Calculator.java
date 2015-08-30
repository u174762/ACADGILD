package asgnmntSession3;

import java.util.Scanner;

public class Calculator {

		//Calculator to perform Addition, Subtraction, Division, Multiplication
		//Consists of five methods to perform above operations
	
	
	public static void main(String args[])
	{
			//Main Method
		
		Scanner ob = new Scanner(System.in);
		System.out.println("Welcome to Calculator");
		
		System.out.println("Enter two values: ");
		double x = ob.nextDouble();
		double y = ob.nextDouble();
		System.out.println("Press 1 to perfom Addition: ");
		System.out.println("Press 2 to perfrom Subtraction: ");
		System.out.println("Press 3 to perform Multiplication: ");
		System.out.println("Press 4 to perfom Division: ");
		int input = ob.nextInt();
		
		if(input == 1)
		{
			System.out.println("The value after addition is: "+Addition(x, y));
		}
		else if(input==2)
		{
			System.out.println("The value after subtraction is: "+Subtraction(x, y));
		}
		else if(input == 3)
		{
			System.out.println("The value after Multiplication is: "+Multiplication(x, y));
		}
		else if(input==4)
		{
			System.out.println("The value after Division is: "+Division(x, y));
		}
		else
		{
			System.out.println("invalid input");
			
		}
		
	}
	
	
	static double Addition(double x1, double y1)
	{
		double sum=0;
		sum = x1+y1;
		
		return sum;
		
	}
	
	static double Subtraction(double x1, double y1)
	{
		double sub;
		sub = y1-x1;
		return sub;
		
	}
	
	static double Multiplication(double x1, double y1)
	{
		double mul;
		mul = x1*y1;
		return mul;
		
	}
	
	static double Division(double x1, double y1)
	{
		double divide;
		divide = x1/y1;
		return divide;
		
	}
	
}
