package asgnmntSession3;

public class PrimeNumeral {

//	This class consists of a method isPrime, which evaluates whether the
//	given input is prime or not
	
	
	
	static String isPrime(int x)
	{
		
//		This method takes an integer as input and evaluates whether it is prime or not.
//		Then returns the number along with is prime or not string
		
		
		int f=0;
		
		if(x==0 || x==1)
		{
			return "Not Prime";
		}
		else if(x<0)
		{
			return "Invalid Input";
		}
		
		else
		{
			for(int i=2;i<x;i++)
			{
				if(x%2==0)
				{
					f++;
					
					break;
				}
				
			}
			
			if(f==0)
			{
				return "The number: "+x+" is prime.";
			}
			else
			{
				return "The Number: "+x+" is Not Prime";
			}

		}
		
		
		
	}
	
	
	
}
