class demo4
{
	
	int callByRef=10;

	void doSomething(String k)
	{
		String s=k.concat("Ahmad");
		System.out.println(s);
		
	}
	
	
	void doSomethingElse(int i)
	{
		int k=i+11;
		
		System.out.println(k);
		
	}

	
	void callByReferenec(demo4 s)
	{
		s.callByRef=90;
		
	}
}


public class Demo3 {
	

	public static void main(String[] args) {
		
		String s="Ashique";
		int i=10;
		
		demo4 obj =new demo4();
		obj.doSomething(s);
		System.out.println(s);
		
		obj.doSomethingElse(i);
		System.out.println(i);
		
		obj.callByReferenec(obj);
		
		System.out.println(obj.callByRef);
		
	}

}
