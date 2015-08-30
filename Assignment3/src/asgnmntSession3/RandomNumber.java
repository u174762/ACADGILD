package asgnmntSession3;
import java.lang.Math;


public class RandomNumber {

	//this class consists of a method to calculate random number within a provided range using 
	// the inbuilt random function of Math Class of Java
	
	public int retRandom(int stop_value)
	{
		
		int return_int = (int) (Math.random()*(stop_value));
		
		return return_int;
	}
	
	
}
