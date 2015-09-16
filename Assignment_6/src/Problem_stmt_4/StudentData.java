package Problem_stmt_4;

import java.util.Scanner;

public abstract class StudentData {

	double roll_num;
	String name, reg_id;
	
	
	public void student_details(){}
	public void Marks(){}
}



class StudentResult extends StudentData
{
	double marks, percentage;
	
	Scanner ob = new Scanner(System.in);
	
	public void student_details()
	{
		System.out.println("Welcome to the Result Processing system...");
		System.out.println("Please enter the following details of the student: ");
		System.out.println("Name: ");
		 name = ob.next();
		System.out.println("Roll number: ");
		roll_num = ob.nextDouble();
		System.out.println("Registration ID");
		 reg_id = ob.next();
		
		
	}
	
	public void Marks()
	{
		System.out.println("Enter the marks of the 5 subjects of the student: ");
		double sub1 = ob.nextDouble();
		double sub2 = ob.nextDouble();
		double sub3 = ob.nextDouble();
		double sub4 = ob.nextDouble();
		double sub5 = ob.nextDouble();
		
		double percentage = 100*((sub1+sub2+sub3+sub4+sub5)/500);
		
		System.out.println("The percentage of "+name+" is: "+percentage);
	}
	
	
}

