
public class Person {
	
	private static String country="India";
	private String fname;
	private String lname;
	private int age;
	
	
	public String getName()
	{
		return this.fname+this.lname;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void setName(String fname, String lname)
	{
		this.fname=fname;
		this.lname=lname;
	}
	
	public void setAge(int age)
	{
		if(age>0)
		this.age=age;
	}

	Person(String fname, String lname, int age)
	{
		this.lname=lname;
		this.fname=fname;
		this.age=age;

	}
		
	public static void main(String[] args) {

		Person p=new Person("ashique","ahmad",10);
		p.setAge(-40);
		System.out.println(p.country);
		System.out.println(Person.country);
		System.out.println();
		
	}
}
