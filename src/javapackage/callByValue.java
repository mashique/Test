package javapackage;

public class callByValue {
	
	int i;
	
	public  void callBvalue(int i)
	{
		i=i+10;
		System.out.println(i);
	}
	
	public void callByRef(callByValue x)
	{
		x.i=x.i+10;
		System.out.println(x.i);
	}

	
	
	public static void main(String[] args) {
		
		//call by value
		
		callByValue obj=new callByValue();
		obj.i=20;
		obj.callBvalue(obj.i);
		System.out.println(obj.i);
		
		//call by reference
		
		obj.callByRef(obj);
		System.out.println(obj.i);

	}

}
