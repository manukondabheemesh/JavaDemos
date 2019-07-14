package Com.javaProgrames;

import java.util.Arrays;

public class StringSorting {
	
	
	/*public static String[] getsortstrings(String str[])
	{
		
		String temp=null;
		for(int i=0;i<str.length-1;i++)
		{
			for(int j=i+1;j<str.length-i;j++)
			{
				if(str[j].compareTo(str[i])<0)
				{
					temp=str[i];
					str[i]=str[j];
					str[j]=temp;
					
				}
			}
		}
		
		return str;
		
		
		
	}*/

	public static void main(String[] args) {
		
		String elements[]={"Madhavi","Bheemesh","Bhavishni","venkatesh","Chaitanya","Anesh"};
		//String sortedele[]=getsortstrings(elements);
		
		Arrays.sort(elements);
		
		for(String ele:elements)
		{
			
			System.out.print(ele + " ");	
						
		}

	}

}
