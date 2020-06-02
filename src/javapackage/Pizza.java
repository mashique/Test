package javapackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

 public class Pizza {

	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> pizza= new LinkedHashMap<String, Integer>();
		LinkedHashMap<String, Integer> top= new LinkedHashMap<String, Integer>();
		
		pizza.put("A", 100);
		pizza.put("B", 200);
		top.put("x", 10);
		top.put("y", 20);
		
		System.out.println("Total Cost = " +Pizza.totalCost(pizza, top));
	}
	
	
	public static int totalCost(LinkedHashMap<String, Integer> p , LinkedHashMap<String, Integer> t)
	{
		Set<Entry<String, Integer>> ps=p.entrySet();
		Set<Entry<String, Integer>> ts= t.entrySet();
		
		int pc=0, tc=0;
		Iterator<Entry<String, Integer>> it=ps.iterator();
	
		while(it.hasNext())
		{
		Map.Entry<String, Integer> entry	=(Map.Entry<String, Integer>)it.next();
		pc=pc + entry.getValue();
		}
		System.out.println("Pizza cost = " +pc);
		

		Iterator<Entry<String, Integer>> it1=ts.iterator();
		
		while(it1.hasNext())
		{
		Map.Entry<String, Integer> entry1	=(Map.Entry<String, Integer>)it1.next();
		tc=tc + entry1.getValue();
		}
		System.out.println("Topings cost = " +tc);
		
		return pc+tc;
	}
	
}
