package p1;

import java.util.*;


public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> newlist=new LinkedList();
		
		newlist.add("monday");
		newlist.add("wed");
		newlist.add("friday");
		
		
		
		newlist.addFirst("sunday");
		
		newlist.addLast("saturday");
		
	System.out.println("first is"+ newlist.getFirst());
	
	System.out.println("first is"+ newlist.getLast());
	
	System.out.println("first is"+ newlist.peekLast());
	
	
	System.out.println("first is"+ newlist.removeFirst());
	
	System.out.println("first is"+ newlist.removeLast());
	
	System.out.println("first is"+ newlist.peekLast());
	
	
		newlist.add(2, "thursday");
		newlist.add(1, "tuesday");
		newlist.set(1, "TUESDAY");
		
		
		
		newlist.remove(1);
		
		
		for(String str:newlist)
		{
			System.out.print(str+"\t");
		}
		
		
		
		
		
		
		
	
		
		
		

	}

}
