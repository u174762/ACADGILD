package Problem_stmt1;

public class Main {

	public static void main(String args[])
	{
		int[] arr1 = {1,2,3,4,5,6};
		System.out.println("Array length is: "+arr1.length);
		
		try
		{
		for(int i=0;i<arr1.length+1;i++)
		{
			System.out.println(arr1[i]);
		}
		}
		catch(Exception e)
		{
			System.out.println("No more values to display");
		}
		
		
	}
	
	
}
