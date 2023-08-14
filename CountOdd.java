package doWhileLoop;

public class CountOdd {
	public static void main(String agrs[])
	{
		int i=30,count=0;
		do {
			if(i%2!=0)
			{count++;
			}i++;
		
	}while(i<=50);
		System.out.println(count);
}
}
