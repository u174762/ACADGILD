package Problem_3;

public class Main {

	public static void main(String args[])
	
	{
		
		ThreadA t1 = new ThreadA();
		ThreadB t2 = new ThreadB();
		ThreadC t3 = new ThreadC();
		
		t1.setPriority(1);
		t2.setPriority(5);
		t3.setPriority(10);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
	
	
}
