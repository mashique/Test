
public class Parent extends Head
{
	
	public Parent()
	{
		System.out.println("Parent Default constructor");
	}
	
	public Parent(int x)
	{
		super(x);
		System.out.println("Parent Parameterize constructor "+ x);
	}

}