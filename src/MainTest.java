
public class MainTest {
	
	public static void main(String[] args) {
		
		MainTest obj = new MainTest();
		obj.face(89, 8);
	}
	
	public void face(int i)
	{
		System.out.println("int single parameter");
	}
	
	public void face(int i, int j)
	{
		System.out.println("int double parameter");
	}
	public void face(long i)
	{
		System.out.println("long single parameter");
	}
	public void face(long i, int j)
	{	
		System.out.println("long double parameter");
	}

}
