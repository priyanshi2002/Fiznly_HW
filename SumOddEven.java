package whileloop;

public class SumOddEven {
	public static void main(String agrs[])
	{
		int i=1,odd=0;
		while(i!=11)
		{
			if(i%2!=0) 
			{
			odd=odd+i;
		    }
			i++;
		}
		
	    System.out.println("odd: "+odd);
				int n=1, even=0;
				while(n!=11)
				{
					if(n%2==0) 
					{
						even=even+n;
				    }
					n++;
				}
				System.out.println("Even: "+even);
						
		int sum=0;
		sum=odd+even;
		System.out.print(sum);
			
    }
}
