class Atest
{
	private int x_private=7;
	public int x_public=7;

	public void publicTool(Inheritance ob)
	{
		int pp=ob.x_public;
		System.out.println(pp);
		
		System.out.println("publicTool");
	}
	
	private void priavte()
	{
		System.out.println("Private");
	}
	
	private void privateTool()
	{	
		
	}

}
public class Inheritance extends Atest {

	public static void main(String[] args) {
		
		Inheritance obj = new Inheritance();
		obj.publicTool(obj);
		
	}

}
