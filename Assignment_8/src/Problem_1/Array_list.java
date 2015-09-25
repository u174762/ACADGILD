package Problem_1;

import java.util.ArrayList;
import java.util.Iterator;


public class Array_list {
	ArrayList<Integer> new_list = new ArrayList<Integer>();


	public void add_to_list()
	{
		new_list.add(1);
		new_list.add(2);
		new_list.add(3);
		new_list.add(4);
	}
	
	public void read_list()
	{
		Iterator itr = new_list.iterator();
		
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
		
		
	}
	
	
}
