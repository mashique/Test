package Test;

class Atest
{
	public Atest menu()
	{
		System.out.println("Hotel Redission");
		return this;
	}

	public Atest order()
	{
		System.out.println("Book my order");
		return this;
	}
	
	public Atest delivery()
	{
		System.out.println("Dispatch Delivery");
		return this;
	}
	
	
}



public class MethodChaining {

	public static void main(String[] args) {
		
		Atest a= new Atest();
		
		a.menu();
		System.out.println(a.toString());
		System.out.println(a.getClass());
		
		
		
		
		
		a.menu().order().delivery();
		
		a.delivery();

	}

}
