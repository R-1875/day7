package p1;

import java.util.*;


public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> mylist=new ArrayList(20);//initial caplacity is 20
		
		mylist.add("c");
		
		mylist.add("b");	
		
		mylist.add("a");
		                   
		
		mylist.add("d");
		
		mylist.add("e");
		
		mylist.add("c");
		
		mylist.add(2, "jayjay");
		mylist.remove(2);
		
		mylist.set(2,"abcabc");
		
		
		System.out.println(mylist.get(3));
		
		for(String str:mylist)
		{
			System.out.print(str+"\t");
		}
		
		//Iterator<String> itr=mylist.iterator();
		
		//while(itr.hasNext())
		//{
		//	System.out.println(itr.next());
		//}
		
		
		
		
		

	}

}
