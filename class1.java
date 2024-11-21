package Selenium_Practice;

public class class1 {

	public static void main(String[] args) // Reverse String
	{
		String name ="deepak";
		int length = name.length();
		String rev ="";
		for(int i=length-1;i>=0;i--)
		{
			rev =rev+name.charAt(i);
			
		}
		System.out.println(rev);
		

	}

}
