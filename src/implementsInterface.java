
public class implementsInterface implements Ainterface, Binterface {
	
	public void year()
	{
		System.out.println("2020 Year");
	}
	
	public void month()
	{
		
		System.out.println("Jan Month");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		implementsInterface ob = new implementsInterface();
		ob.year();
		ob.month();

	}

}
