package javapackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionsTest {

	public static void main(String[] args) {
		
		LinkedList<Integer> al= new LinkedList<Integer>();
		
		al.add(new Integer(2));
		al.add(new Integer(8));
		al.add(new Integer(5));
		al.add(new Integer(1));


		Iterator i= al.iterator();

		Collections.reverse(al);
		
	
		
		Collections.sort(al);
		
		
		
		while(i.hasNext())
		{
			System.out.print(i.next() + " ");
			
		}
		
		


	}

}
