package assignment_5;

import java.util.Scanner;

public class BankScenario {

	private double _interestRate;
	
	public double getRateOfInterest()
	{
		_interestRate = 8.00;
		
		return _interestRate;
		
	}	
}


class ICICI extends BankScenario
{
	Scanner ob = new Scanner(System.in);
	
	
	public double getRateOfInterest()
	{
		System.out.println("The old interest rate is: "+super.getRateOfInterest());
		System.out.println("Enter the new Interest rate: ");
		double new_rate = ob.nextDouble();
		
		return new_rate;
	}
	
}


class SBI extends BankScenario
{
	Scanner ob = new Scanner(System.in);
	
	public double getRateOfInterest()
	{
		System.out.println("The old interest rate is: "+super.getRateOfInterest());
		System.out.println("Enter the new Interest rate: ");
		double new_rate = ob.nextDouble();
		return new_rate;
		
	}
}


class AXIS extends BankScenario
{
Scanner ob = new Scanner(System.in);
	
	public double getRateOfInterest()
	{
		System.out.println("The old interest rate is: "+super.getRateOfInterest());
		System.out.println("Enter the new Interest rate: ");
		double new_rate = ob.nextDouble();
		return new_rate;
		
	}
	
	
	
}