
class A5
{
int i;

A5(int a)
{
	this.i=a;
	System.out.println(a);
}
}

class B5 extends A5
{
int i;

B5(int a)
{
	super(a);
	this.i=a;
	System.out.println(a);
}

}

public class Inherit2 extends B5{
	
	Inherit2(int x)
	{
		super(x);	
	}
	

	public static void main(String[] args) {
		
		B5 obj = new B5(10);	
	}

}
