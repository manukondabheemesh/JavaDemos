package Com.javaProgrames;

public class Deletenumberarray {
	
	public static int[] Deletenumberfromarray(int[] intarry,int index)
	{
		
		int newarry[]=new int[intarry.length-1];
		
		for(int i=0,k=0;i<intarry.length;i++)
		{
			
			
			if(i==index)
			{
				continue;
			}
			
			
			newarry[k++]=intarry[i];
			
		}
		
		
		
		return newarry; 
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		int[] array={2,4,5,6,7,8};
		
		
		int[] afterdeletarry=Deletenumberfromarray(array,3);
		
		
		for(int num:afterdeletarry)
		{
			System.out.print(num + " ");
		}
	}

}
