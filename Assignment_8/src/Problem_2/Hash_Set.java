package Problem_2;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_Set {

	HashSet<String> new_set = new HashSet<String>();
	
	protected void read_set()
	{
		System.out.println("Adding values to the Set");
		
		new_set.add("One");
		new_set.add("Two");
		new_set.add("Three");
		new_set.add("Four");
		new_set.add("Five");
		
		System.out.println("Add complete");
	}
	
	public void print_set()
	{
		System.out.println("Printing the values of HashSet");
		
		Iterator itr = new_set.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	
}
