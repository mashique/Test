
public class Fibonacci {

	
	
	public static void main(String[] args) {
		
		int sum, t1=0, t2=1;
		
		for(int i=0; i<=5;i++)
				
				{
					System.out.println(t1);
					
					sum=t1+t2;
					t1=t2;
					t2=sum;
					
				}

	}

}
