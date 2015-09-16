package Problem_stmt4;

import java.util.Scanner;

public class StringMain {

	public static void main(String args[])
	{
		String x = null;
		
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter the value for x");
		x = ob.next();
		
		System.out.println("The length of the string is: "+x.length());
		
		try{
		for(int i=0;i<x.length()+1;i++)
		{
			System.out.print(x.charAt(i));
		}
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println(" ...\nNo character at the requested position");
		}
		
	}
	
	
	
	
}
