package Assignment4;

import java.util.Scanner;

public class ReverseString {

	Scanner ob = new Scanner(System.in);
	
	
	public void stringReverser(String x)
	{
		//System.out.println(x.length());
		
		for(int i=x.length()-1;i>=0;i--)
		{
			System.out.print(x.charAt(i));
		}
		
	}
	
	
	
	
	
}
