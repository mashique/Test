package javapackage;

public class Employee {
	
	int employeeAge;
	
	public Employee(String ename)
	{
		System.out.println("Employee name is :" + ename);
	}
	
	public void setEmployeeAge(int eage)
	{
		employeeAge = eage;
	}
	
	public int getEmployeeAge()
	{
		System.out.println("Employee Age is :" + employeeAge);
		return employeeAge;
	}
	
	public static void main(String[] args) {
	
		Employee employeeData = new Employee("Ramesh");
		employeeData.setEmployeeAge(23);
		employeeData.getEmployeeAge();

	}

}
