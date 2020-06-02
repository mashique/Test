package javapackage;

import java.util.Scanner;

public class Demo29 {
	
	static int counter=0;

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		
		int c=0;
		for(int x=0 ; x<=n; x++)
		{
			if(Check_Prime(x))
			{	
				c++;
				System.out.println(x);
			}
			
		}
		
		System.out.println("Total Count :  " +c);
//		
//		if(checkPrime(n))
//			System.out.println("Prime Number");
//		else
//				System.out.println("Not a Prime Number");
//		
		
	}
	
	public static boolean Check_Prime(int n)
    { int max = 0;
     if (n<=1)
            return false;
        if ((n==2)||(n==3))
            return true;
        if ((n %2==0) || (n %3==0)) //6k+2/3/4
            return false;
        for (int i = 6; i-1<=(int)Math.sqrt(n); i=i+3) //6k+-1
        {
            max = max + 1;
            if ((n % (i - 1) == 0) || (n % (i + 1) == 0))
           return false;
        }
        if (counter < max)
        { counter=max ; }
        return true;
    }

}
