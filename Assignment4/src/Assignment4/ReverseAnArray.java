package Assignment4;

import java.util.Scanner;

public class ReverseAnArray {
	//This class consists of a method which takes input into a form of an array and then prints out
	//the values of the array into reverse order
	
	
	
	Scanner ob = new Scanner(System.in);
	protected void reverseArray(int[] x)
	{
		//this method takes an array of size 6 and then asks user to input the values
		//it then reverses the value of the array
		
		System.out.println("Enter the values into the Array: ");
		
		for(int i=0;i<x.length;i++)
		{
			x[i] = ob.nextInt();
		}
		
		System.out.println("The values of array are: ");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		
		System.out.println("The reverse values are: ");	
		for(int i=x.length-1;i>=0;i--)
		{
			System.out.println(x[i]);
		}
		
	}
	
}
