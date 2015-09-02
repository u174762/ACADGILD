package Assignment4;

import java.util.Scanner;

public class EmployeeDetails {

	private String emp_name, emp_adrs, emp_email_id;
	private long emp_id, emp_phn_num;

	Scanner ob = new Scanner(System.in);
	
	public void employeeDetails()
	{
	
		
		
		System.out.println("Please enter employee name: ");
		emp_name = ob.nextLine();
		
		System.out.println("Enter the address of employee: ");
		emp_adrs = ob.nextLine();
		
		
		System.out.println("Enter email_id: ");
		emp_email_id = ob.nextLine();
		
		System.out.println("Enter employee phone_number: ");
		emp_phn_num = ob.nextLong();
		
		
		System.out.println("Enter the employee id: ");
		emp_id = ob.nextLong();
		
		
		int c = 0;
		
		while(c<1)
		{
			System.out.println("Employee name: "+emp_name);
			System.out.println("Employee id: "+emp_id);
			System.out.println("Employee phone number: "+emp_phn_num);
			System.out.println("Employee email-id: "+emp_email_id);
			System.out.println("Employee Address: "+emp_adrs);
			c++;
		}
		
		
	}
	
	
	
	
}
