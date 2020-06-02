

abstract class Bike{
	
	int a=10;
	
	Bike()
	{
		a=2500;
		
		System.out.println("parents abtract constructor");
	}
	
	
	abstract void speed();
	
	public void sspeed()
	{
		System.out.println("child constructor");
	}
	
	
} 
public class AbstractClass extends Bike {
	
	int b=20;
	
	
	AbstractClass()
	{
		
		b=1000;
		
		System.out.println("child constructor");
	}
	
	public void sspeed()
	{
		System.out.println("base override");
	}
	
	void speed() {
		System.out.println("Bike speed");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractClass obj = new AbstractClass();
		
		System.out.println(" intializing through constructor +" +obj.a);
		System.out.println(" intializing through constructor +" +obj.b);
		obj.sspeed();

	}

}
