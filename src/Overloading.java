
public class Overloading {

	public void foo(int i)
	{
		System.out.println("one argu");
	}
	
	public void foo(int i, int j)
	{
		System.out.println("Two argu");
	}
	
	public int foo(int i, int j, int k)
	{
		System.out.println("Three argu");
		return 0;
	}
	

	
	public static void main(String[] args) {
		
		Overloading ob= new Overloading();
		ob.foo(4, 6);

	}

}
