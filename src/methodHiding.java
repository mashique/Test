class A2
{
	public static void max()
	{
	System.out.println("Method of super class");	
	}
	
}

class B2 extends A2
{
	public static void max()
	{
	System.out.println("Method of SUB class");	
	}
	
}

public class methodHiding {

	public static void main(String[] args) {
	
		A2 a= new B2();
		a.max();
		
		
		B2 b= new B2();
		b.max();
		

	}

}
