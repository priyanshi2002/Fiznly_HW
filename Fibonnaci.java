package doWhileLoop;

public class Fibonnaci {
	public static void main(String agrs[])
	{
		int n = 10, firstTerm = 0, secondTerm = 1,i=1;
     do {
    			System.out.println(firstTerm);
    			 int next = firstTerm + secondTerm;
    			 firstTerm= secondTerm;
    			 secondTerm= next;
    			 i++;
    			
     }
		while(i<=10);
	}

}
