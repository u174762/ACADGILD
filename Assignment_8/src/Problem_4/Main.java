package Problem_4;

public class Main {

	
	public static void main(String args[])
	{
		Thread_Count t1 = new Thread_Count();
		t1.start();
		
	}
	
	
}


class Thread_Count extends Thread
{
	
	

	
	public void run()
	{
		String x = Thread.currentThread().getName();
		
		for(int i=1;i<11;i++)
		{
			System.out.println(x+" thread will be alive till the child is alive.");
			System.out.println("Count: "+i);
		}
	}
	
}