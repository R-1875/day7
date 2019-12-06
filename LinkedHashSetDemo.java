package p1;

import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		Set<String> newset=new LinkedHashSet();
		
		
		newset.add("temple");
		
		newset.add("amphi-theatre");
		
		newset.add("restaurant");
		
		newset.add("multiplex");
		
		
		Iterator<String> itr= newset.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		
		Object[] myarr=newset.toArray();
		
	}

}
