package Test;

class Demo1
{

	public String toString()
	{
		String s="Ashique";
		return s;
	}
	void too()
	{
		
	}

}

public class Test2 {

	public static void main(String[] args) {
		
		Demo1 o =new Demo1();
		foo(o);
	}
	
	static void foo(Demo1 a)
	{
		
		System.out.println(a.toString());
	
		
		
	}

}
