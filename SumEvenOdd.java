package doWhileLoop;

public class SumEvenOdd {
	public static void main(String agrs[])
	{
		int i=1,a=0;
		do {
			if(i%2==0)
			a=a+i;
			i++;
		
	}while(i<=10);
		System.out.println("Even: "+ a);
		
		int n=1,p=0;
		do {
			if(n%2==0)
			p=p+n;
			n++;
		
	}while(n<=10);
		System.out.println("Odd: "+ p);
}
}
