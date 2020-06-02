


public class PlayWithStatic {
	
	static void over(Aaaa a)
	{
		System.out.println("A");
	}
	
	static void over(Bbbb b)
	{
		System.out.println("B");
	}
	static void over(Object o)
	{
		System.out.println("Object");
	}

	public static void main (String[] args)
	{
		Cccc ob =new Cccc();
		over(ob);
	}
}
