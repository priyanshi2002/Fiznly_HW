package whileloop;

public class CountEven {
	public static void main(String agrs[])
	{
		int i=1,count=0;
		
		while(i<=25)
		{
			if(i%2==0) 
			{
			count++;
		    }
			i++;
		}
		System.out.println(count);
		}
}
