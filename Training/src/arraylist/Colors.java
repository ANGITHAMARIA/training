package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Colors {
	public static void main(String args[])
	{
		int flag=0;
List<String> list=new ArrayList<String>();
list.add("Red");
list.add("Green");
list.add("Blue");
list.add("Orange"); 
System.out.println(list);
Iterator<String> itr=list.iterator();
while(itr.hasNext())
{
	if(itr.next()=="Yellow")
	{
	System.out.println("Element found");
	flag++;
	}
}
if(flag==0)
{
	System.out.println("Element not found");
}
}
}
