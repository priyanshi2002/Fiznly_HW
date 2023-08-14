package doWhileLoop;

public class Odd50 {
	public static void main(String agrs[])
	{
		int i=1,ans=0;
		do {
			if(i%2!=0) {
				ans=+i;
			}
			i++;
			
	}while(i<=50);
		System.out.println(ans);
	}
}
