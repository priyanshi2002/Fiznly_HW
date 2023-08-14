package forloops;

public class SumOddEven {
	public static void main(String agrs[])
	{
		int odd=0;
      for(int i=1 ; i<= 10 ; i=i+2)
      {
    	  odd=odd+i;
    	  
      }
      System.out.println("Odd: "+odd);
      int even=0;
      for(int i=1 ; i<=10 ; i++)
      {
    	  if(i%2==0) {
    	  even=even+i;
    	  }
      }
      System.out.println("Even:" + even);
      int sum;
      sum= even+odd;
      System.out.println("Sum: "+ sum);
    }
}
