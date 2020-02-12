package def.pack;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListCollection {
	
	public static void main(String [] args) {
	
		List<Integer> l=new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(1, 8);
		
		System.out.println(l);
		
		LinkedList<Integer> ll=new LinkedList<>();
		ll.add(1);
		ll.add(2);
		ll.add(1, 8);
		ll.addFirst(110);
		ll.addLast(690);
		ll.addFirst(55);
		ll.add(1, 543); // once an index is used, other data at same index is nullified
		
		System.out.println(ll);
	}
}