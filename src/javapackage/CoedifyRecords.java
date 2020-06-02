package javapackage;

import java.util.Scanner;

public class CoedifyRecords {
	
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("How many records do you want to insert");
		int n= sc.nextInt();
		
		
		Object[][] Obj= new Object[n][5];
		
		for(int i=0; i<n; i++)
		{
				
				System.out.println("Please Enter ID");
				int id= sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Please Enter Name");
				String Name= sc.nextLine();
				
				System.out.println("Please Enter Age");
				int Age= sc.nextInt();
				
				sc.nextLine();
				
				System.out.println("Please Enter Address");
				String Address= sc.nextLine();
				
				
				System.out.println("Please Enter MobileNumber");
				String MobileNumber= sc.nextLine();
				
				
				Obj[i][0]=id;
				Obj[i][1]=Name;
				Obj[i][2]=Age;
				Obj[i][3]=Address;
				Obj[i][4]=MobileNumber;

			
		}
		
		
		// Retrieve the Records
		
		for(int i=0; i<n; i++)
		{

				
				System.out.println(Obj[i][0] +"      "+ Obj[i][1] +"      "+ Obj[i][2] +"      "+ Obj[i][3] +"      "+ Obj[i][4]);

			
		}
		
		
		
		
	}

}
