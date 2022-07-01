package week3.day1.classroom;

import java.util.ArrayList;
import java.util.List;

public class CollectionReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String> rev=new ArrayList();
rev.add("Red");
rev.add("green");
rev.add("blue");
rev.add("yellow");
rev.add("green");

int size=rev.size();
System.out.println(size);

for (int i = size-1; i >=0; i--) {
	//System.out.println("index" +i);
	String revValue=rev.get(i);
	System.out.println(revValue);
}

	}

}
