package Test;

public class GetRevNumber {

	public static void main(String[] args) {
		
		
		System.out.println(revNumber(35478));
		

	}
	
	public static int revNumber(int number)
	{	
		int revnumer=0;
		
		while(number>0)
		{
			revnumer= revnumer*10 + number%10;
			number=number/10;		
		}
		
		return revnumer;
	}

}
