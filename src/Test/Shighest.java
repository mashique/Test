package Test;

import java.util.ArrayList;

public class Shighest {
	
	
	public static void main(String[] args) {

		ArrayList<Integer> al= new ArrayList<Integer>();
		al.add(11);
		al.add(32);
		al.add(7);
		al.add(50);
		al.add(2);
		al.add(49);
		al.add(50);
		
		
		System.out.println(sHighest(al));
	}

	public static int sHighest(ArrayList<Integer> a)
	{
		int f=0,s=0,l;
		l=a.size();
		
		for(int i=0; i<l; i++)
		{
			if(a.get(i)>f)
			{
				s=f;
				f=a.get(i);
			}
			else if(a.get(i)>s)
			{
				s=a.get(i);
			}
		}
		
		return s;
	}
}
