package Test;

public class TestStatic {
	
	static int n=300;
	
	 TestStatic()
	{
		 TestStatic.n=50;
	}
	 
	 TestStatic(int m)
	{
		 TestStatic.n=m;
	}

	static void TestStatic()
	{
		
		TestStatic.n=100;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestStatic ob= new TestStatic();
		System.out.println(ob.n);
		
		
		TestStatic ob1= new TestStatic(100);
		System.out.println(ob1.n);
		
		System.out.println(ob.n);
		
		System.out.println(TestStatic.n);
		
		
	}

}
