
public class StaticVariable {
	
	static String name="Ashique";
	int age=25;

	
	public static void main(String[] args) {
		
		System.out.println(name);
		
		StaticVariable obj = new StaticVariable();
		System.out.println(obj.age);
		
		obj.Age();
	}
	
	public void Age()
	
	{
		
		System.out.println(name);
		System.out.println(age);
	}

}
