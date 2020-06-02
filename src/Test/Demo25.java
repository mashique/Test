package Test;

class TestA
{
	public void print()
	{
		System.out.println("function of Test A");
	}

}

class TestB extends TestA
{
	public void print()
	{
		
		System.out.println("function of Test B");
		
	}

}


public class Demo25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestB b=new TestB();
		b.print();
		
		TestA a= new TestA();
		a.print();
		
		TestA aa=new TestB();
		aa.print();
	

	}

}
