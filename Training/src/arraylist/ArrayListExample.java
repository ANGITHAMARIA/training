package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	public static void main(String args[])
	{

	List<Integer> list=new ArrayList<Integer>();
	list.add(50);
	list.add(20);
	list.add(15);
	list.add(30);
	list.add(50);
	System.out.println(list);
	Iterator<Integer> it=list.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
}
}
