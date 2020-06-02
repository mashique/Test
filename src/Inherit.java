 class A
{
	 String nam="Hello A";
	 
	 public String hello()
	 {
		
		 return "Hello A";
	 }
	 
	 public String Ice()
	 {
		
		 
		 return "Ice A";
	 } 

}

 class B extends A
 {
	 String name="Hello B";
	 public String hello()
	 {
		
		 
		 return "Hello B";
	 } 
	 
	 public String Water()
	 {
		
		 
		 return "Water B";
	 } 
	 
 }

public class Inherit extends B{
	
	String na= "Heloo";

	public static void main(String[] args) {

		 A  a= new Inherit();
		 B  b= new Inherit();
		 Inherit in =new Inherit();
		 A a1= new A();
		 
		 B  b1= new B();
		 System.out.println(b1.hello());
		 System.out.println(b1.Ice());
		 
		 A a2= new B();
		 System.out.println(a2.hello());
		 System.out.println(a2.Ice());
		 
		 Object obj=new Inherit();
		 
		 System.out.println(in.hello());
		 System.out.println(a1.hello());
	//	 System.out.println(obj.);
		 
		 System.out.println(((Inherit)obj).nam);
//		 System.out.println(a.nam);


	}

}
