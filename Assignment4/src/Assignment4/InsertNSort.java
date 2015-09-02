package Assignment4;

import java.util.Scanner;

public class InsertNSort {
	
	// This class consists of a method to first input values into an array, sort the array in arranging order, and then
	// prompt user to insert the value at a particular position
	// the new values are then displayed.	
	
	Scanner ob = new Scanner(System.in);
	
	public void sortNinsert(int[] x)
	{
		System.out.println("Enter the values into the array: ");
		
		for(int i=0;i<x.length;i++)
		{
			x[i]=ob.nextInt();
			
		}
		
		System.out.println("The values are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		int k=0;
		for(int i=0;i<x.length-1;i++)
		{
			if(x[i+1]<x[i])	// arranging the array values in increasing order
			{
				k=x[i];
				x[i]=x[i+1];
				x[i+1]=k;
			}
		}
		System.out.println("The sorted array is: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		int position, value;
		System.out.println("Enter the position at which you enter the value: ");
		position = ob.nextInt();
		System.out.println("Enter the value: ");
		
		value = ob.nextInt();
		
		for(int i=0;i<x.length;i++)
		{
			if(i==position)
			{
				x[i]=value;
			}
		}
		
		System.out.println("The new array values are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
	}
	
	

}
