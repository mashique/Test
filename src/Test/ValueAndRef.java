package Test;



public class ValueAndRef {
	
	int a=10;
	int b=20;
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int addTo(ValueAndRef ob)
	{
		int c=ob.a + ob.b;
		return c;
	}

	public static void main(String[] args) {
	
		int x=1;
		int y=3;
		ValueAndRef obj= new ValueAndRef();
		System.out.println(obj.add(x, y));
		
		System.out.println(obj.addTo(obj));
		
		
	}

}
