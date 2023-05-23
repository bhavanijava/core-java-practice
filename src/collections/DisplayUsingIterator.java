package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DisplayUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=50;i>=10;i-=10)
		{
			list.add(i*10);
			
		}
		System.out.println("Details are");
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext())
		{
			Integer x=itr.next();
			System.out.println(x);
		}
		
	}

}
