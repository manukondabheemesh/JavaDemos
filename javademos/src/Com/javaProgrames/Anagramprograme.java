package Com.javaProgrames;

public class Anagramprograme {
	
	public static boolean  findanagram(String str1,String str2)
	{
		
		char[] chararry=str1.toCharArray();
		
		StringBuilder sb=new StringBuilder(str2);
		
		for(char ch:chararry)
		{
			int index=sb.indexOf(String.valueOf(ch));
			
			if(!(index==-1))
			{
				sb.deleteCharAt(index);
			}
			
			else
			{
				return false;
			}
			
						
		}
		
		
		
		return (sb.length()==0);
		
			
		
		
		
	}
	
	

	public static void main(String[] args) {
		
		
		boolean flag=findanagram("apple","pple");
		
		System.out.println(flag);
		

	}

}
