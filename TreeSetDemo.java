package p1;


import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set<Double> allset=new TreeSet();
		
		
		allset.add(555.55);
		allset.add(3333.3);
		allset.add(2222.2);
		
		allset.add(111.1);
		
		
		Iterator<Double> itr= allset.iterator();
		
		while(itr.hasNext())
		{
			
			System.out.println(itr.next());
		}
		

	}

}
