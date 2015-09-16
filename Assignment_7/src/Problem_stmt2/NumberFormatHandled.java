package Problem_stmt2;

import java.util.Scanner;

public class NumberFormatHandled {

	public static void main(String args[])
	{
		int x, y, z;
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the first value for addition: ");
		x = ob.nextInt();
		try
		{
		System.out.println("Enter the second value: ");
		y = Integer.parseInt(ob.next());
		}
		catch(NumberFormatException e)
		{
			System.out.println("Please enter a numerical value: ");
			y = ob.nextInt();
		}
		z = x+y;
		
		System.out.println("Value after addition are: "+z);
		
		
	}
	
	
}
