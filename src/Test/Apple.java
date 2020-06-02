package Test;

class Fruit
{
	
private Fruit()
	{
	
	}

public static Fruit getInstance()
 	{
	
	return new Fruit();
 	}

public void add()
	{
	System.out.println("addition");
	}
}



public class Apple {

	public static void main(String[] args) {
	 
		Fruit obj= Fruit.getInstance();
		obj.add();
		
	}

}
