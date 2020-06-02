package Test;

public class InterfaceDemo extends Demo1 implements InterfaceA , InterfaceB  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceA obj = new InterfaceDemo();
		obj.intA();
		
		InterfaceB obj1 = new InterfaceDemo();
		
		obj1.intA();
		
	}

	
	@Override
	public void intA() {
		
		System.out.println("test");	
	}

}
