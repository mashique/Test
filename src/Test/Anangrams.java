package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anangrams {
	

	public static void main(String[] args) {
		
		ArrayList<String>  ar= new ArrayList<String>();
		
		ar.add("code");
		ar.add("edoc");
		ar.add("eocd");
		ar.add("test");
		ar.add("estt");
		ar.add("frame");
	
		int l=ar.size();
		
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		
		for(int i=0; i<l; i++)
		{
			String a= ar.get(i);
			hm.put(Anangrams.sortString(a), i);
			
		}
		
		for(String wr : hm.keySet())
		{
			System.out.println(wr);
		}
		
	}
	
	public static String sortString(String a)
	{
		char ch[]=a.toCharArray();
		Arrays.sort(ch);
		
		String s=new  String(ch);
		System.out.println(s);
		return s;
	}
	
	
}
