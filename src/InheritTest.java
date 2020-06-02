class X
{
	void cal(int a, int b)
	{
		System.out.println("X");
	}
}

class Y extends X
{
	void cal(int a, int b)
	{
		System.out.println("Y");
	}
}

class Z extends Y
{
	void cal(int a, int b)
	{
		System.out.println("Z");
	}
}

public class InheritTest {

	public static void main(String[] args) {
		
		X x=new Y();
		x.cal(10, 20);
		
		Y y = (Y)x;
		y.cal(10, 20);
		
		Z z=(Z)y;
		y.cal(10, 20);
		
	}

}
