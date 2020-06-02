class A1
{
	public void foo()
	{
		System.out.println("Hello A");
	}

}

class B1 extends A1
{
	public void foo()
	{
		System.out.println("Hello B");
	}

}


public class Demo2 {	

	public static void main(String[] args) {
		
		A1 a= new B1();
		a.foo();
					
		}

}
