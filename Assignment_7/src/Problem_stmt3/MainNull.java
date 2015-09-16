package Problem_stmt3;

import java.util.Scanner;

public class MainNull {

	
	public static void main(String args[])
	{
		
		xyz ob=null;
		
		System.out.println("Enter a value: ");
		Scanner ob1 = new Scanner(System.in);
		int val = ob1.nextInt();

		try{
		ob.value_x(val);
		}
		catch(NullPointerException e)
		{
			System.out.println("The object of class assigned with null value");
			xyz x_obj = new xyz();
			x_obj.value_x(val);
		}
		
		
		
		
	}
	
	
}

class xyz 
{
	int x;
	public void value_x(int y)
	{
		x=y;
		System.out.println("The value of x is: "+x);
	}
}