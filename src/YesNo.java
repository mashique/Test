import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class YesNo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		ArrayList<String> al= new ArrayList<String>();
		

		while(al.size()<3)
		{	
			System.out.println("Please enter word");
			al.add(sc.nextLine());
			
			if(al.size()==1)
			{
				System.out.println("New");
			}
			
			else
			{
					for(int x=0; x<al.size(); x++)
				{
					if(al.get(al.size()-1)==al.get(x))
					{
						System.out.println("Existing");
					}
					
				}
		
			}
			
		
		}
		
		
	}

}
