package p1;

import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Set myset=new HashSet();
		
		
		myset.add("Vijay");
		
		myset.add(9999);
				
		myset.add('M');
		
		//myset.add(true);
		
		myset.add(10101);
		myset.add(9999.99);
		
		
		
		System.out.println("size"+ myset.size());
		
		
		myset.contains(10101);
		
		System.out.println(""+ myset);
		
		System.out.println(""+ myset.contains(10101));
		
		myset.clear();
		
		
		System.out.println("size"+ myset.size());
		System.out.println(""+ myset);
		
		System.out.println(""+ myset.isEmpty());
		

	}

}
