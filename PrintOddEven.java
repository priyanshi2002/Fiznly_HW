package forloops;

public class PrintOddEven {
	public static void main(String agrs[])
	{
		int odd=0;
      for(int i=1 ; i<= 10 ; i=i+2)
      {
    	  System.out.println("Odd: "+i);
    	  
      }
      System.out.println("**********" );
      int even=0;
      for(int i=1 ; i<=10 ; i++)
      {
    	  if(i%2==0) {
    		  System.out.println("Even:" + i);
    	  }
      }
      
     
    }
}
