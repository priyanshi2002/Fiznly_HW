package whileloop;

public class SumEven {
	public static void main(String agrs[])
	{
		int i=1,even=0;
		while(i<=50)
		{
			if(i%2==0) 
			{
				even=even+i;
		    }
			i++;
		}
		
				System.out.println(even);
			
    }
}
