package Test;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		int a[]= {7,6,3,6,7,1,2,2};
		int i=0;
		
		Arrays.sort(a);

		// 1 2 2 3 6 6 7 7
		
		for(int j=0; j<a.length-1; j++)
		{
			if(a[j]!=a[j+1])
			{
				a[i++]=a[j];  // 1, 2 , 3 , 6 
			}
			
		}
		a[i]=a[a.length-1];

		
		for(int x=0; x<=i; x++)
		{
			System.out.print(a[x]);
		}
		
		
		
		
		
	}

}
