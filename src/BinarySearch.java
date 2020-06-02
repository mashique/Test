import java.util.ArrayList;

public class BinarySearch {

	public static void main(String[] args) {
	
		ArrayList<Integer> ar= new ArrayList<Integer>();
		
		ar.add(2);
		ar.add(4);
		ar.add(6);
		ar.add(8);
		ar.add(12);
		ar.add(22);
		ar.add(24);
		ar.add(28);
		ar.add(40);
		ar.add(50);
		

		int length = ar.size()-1;
		int z=22;
		
		BinarySearch ob = new BinarySearch();
		int result= ob.binarySearch(ar, 0, length, z);
		System.out.println(result);

	}
	
	int binarySearch(ArrayList<Integer> al, int findex, int lindex , int x)
	{
		if(lindex>=findex)
		{
			int mid= findex + (lindex-findex)/2;
			
			if(al.get(mid)==x)
				return x;
			if(al.get(mid)>x)
				return binarySearch(al,findex,mid-1 ,x);
			if(al.get(mid)<x)
				return binarySearch(al,mid+1,lindex,x);
			
		}
		
		return -1;
	
	}
	


}
