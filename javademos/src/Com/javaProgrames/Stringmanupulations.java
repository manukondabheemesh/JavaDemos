package Com.javaProgrames;

public class Stringmanupulations {
	
	
	//wellsfargo
	public static void  getstringoperations(String str)
	{
		
		
		for(int i=0;i<str.length();i++)
		{
			int counter=0;
			for(int j=0;j<str.length();j++)
			{
				
				if((str.charAt(i)==str.charAt(j))&& i>j)
				{
					break;
				}
				
				
			if(str.charAt(j)==str.charAt(i))
			{
				counter++;
			}
				
			}
			
			
			System.out.println("the  charcter is" + " "+ str.charAt(i)+ " " + counter);
		}
		
		
		
	}

	public static void main(String[] args) {
		
		
		getstringoperations("wellsfargo");
		

	}

}
