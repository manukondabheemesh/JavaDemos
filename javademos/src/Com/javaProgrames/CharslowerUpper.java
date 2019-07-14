package Com.javaProgrames;

import java.util.Arrays;

public class CharslowerUpper {
	
	
	public static char[] Combinedupperlower(String  str)
	{
		
		  Arrays.sort(str.toCharArray());
     
     
		
		return str.toCharArray();
		
	}
	
	

	public static void main(String[] args) {
		
		String upperlower="AbcaBDEdeC";
		
		System.out.println(upperlower);
		
		char[] chararry=Combinedupperlower(upperlower);
		
		for(char ch:chararry)
		{
			System.out.print(ch + " ");
		}
		

	}

}
