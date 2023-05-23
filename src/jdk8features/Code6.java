package jdk8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Code6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<Integer>();
		for(int i=10;i<=50;i+=10) {
			list.add(i);
		}
		System.out.println("Details are");
		Stream<Integer> st=list.stream();
		//st.forEach(x->System.out.println(x));
		st.forEach(System.out::println);
		
	}

}
