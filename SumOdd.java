package whileloop;

public class SumOdd {
	public static void main(String agrs[])
	{
		int i=1,odd=0;
		while(i!=50)
		{
			if(i%2!=0) 
			{
			odd=odd+i;
		    }
			i++;
		}
		
				System.out.println(odd);
			
    }
}
