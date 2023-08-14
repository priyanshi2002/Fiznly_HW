package whileloop;

public class Fibonacci {
	public static void main(String agrs[])
	{
		int  firstTerm = 0, secondTerm = 1,i=1;
     
		while(i<=10) {
		System.out.println(firstTerm);
		 int next = firstTerm + secondTerm;
		 firstTerm= secondTerm;
		 secondTerm= next;
		 i++;
		}
	}

}
