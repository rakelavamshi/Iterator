import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo 
{

	public static void main(String[] args) 
	{

		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(6);
		al.add(45);
		System.out.println(al);
		
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		

	}

}
