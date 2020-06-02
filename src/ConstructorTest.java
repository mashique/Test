

public class ConstructorTest extends Parent{
		
	ConstructorTest()
	{
		
		System.out.println("child default constructor");
		
	}
	
	ConstructorTest(int x)
	{
		super(x);
		System.out.println("child Parameterize constructor  " + x);
		
	}
	
	public static void main(String[] args) {

		ConstructorTest obj1= new ConstructorTest();
		
		ConstructorTest obj= new ConstructorTest(9);
	

	}

}
