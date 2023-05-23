package collections;
import java.util.*;
public class SetInternalImp {

	public static void main(String[] args) {
		
		Set<Integer> set=new LinkedHashSet<Integer>();
		set.add(10);
		set.add(12);
		set.add(9);
		set.add(12);
		set.add(11);
		set.add(13);
		
		set.forEach(a->System.out.println(a));
	}

}
