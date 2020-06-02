package javapackage;



class Demo30
{

	public static void main(String args[])
		{
		
		String s1= "Hello   World 	Testing";
		String s2= "My World Testing";
		
		if(compareLast10Charaters(s1, s2))
			System.out.println("Last 10 Charaters are same");
		else
			System.out.println("Last 10 Charaters are NOT same");
		

		}
	
	
	
		public static boolean compareLast10Charaters(String s1 , String s2)
		{
			String sf=s1.replaceAll("\\s", "");
			String ss=s2.replaceAll("\\s", "");
			
			int x= sf.length()-1;
			int y= ss.length()-1;
			
			
				for(int i=x; i>=x-10; i--)
				{
					if(sf.charAt(i) != ss.charAt(y))
						
						return false;
					
					y--;
				}
			
				return true;
		}
		

}

