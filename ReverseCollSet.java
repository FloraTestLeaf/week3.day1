package week3.day1.classroom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ReverseCollSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Set<String> s1=new HashSet<String>();---order maintained panathu
		//use hash set to maintain order
		Set<String> s1=new LinkedHashSet<String>();
		s1.add("Red");
		s1.add("Green");
		s1.add("Blue");
		s1.add("Yellow");
		s1.add("Brown");
		
		List<String>l1=new ArrayList<String>(s1);
		
		int size1=l1.size();
		for (int i = size1-1; i>=0; i--) {
			String str1=l1.get(i);
			System.out.println(str1);
		}
}
}
