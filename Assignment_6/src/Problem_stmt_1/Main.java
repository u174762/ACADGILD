package Problem_stmt_1;

public class Main {	
	
	
	
	public static void main(String args[])
	{
		
		
		
		Demo1 ob_demo1 = new Demo1();  
		
		ob_demo1.printer(25);
		
	}
	
}


class Demo1 implements InterDemo		//Class which implements the interface InterDemo and adds to the printer
{									   //function which prints the value of the argument passed onto it.

	@Override
	public void printer(double x) {

		System.out.println("The value of the variable is: "+x);
		
	}
	
}

class Demo2 implements InterDemo		//Class which implements the interface InterDemo and adds to the body of printer function
{										// which prints the square of the argument passed onto it.

	@Override
	public void printer(double x) {
		
		System.out.println("The square of the value entered is: "+x*x);
		
	}
	
}
