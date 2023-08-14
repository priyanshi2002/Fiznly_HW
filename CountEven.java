package forloops;

public class CountEven {
	public static void main(String agrs[])
	{
		int even=0;
	      for(int i=1 ; i<=25 ; i++)
	      {
	    	if(i%2==0)
	    	{
	    		 even++;
	       	    
	    	}
	      }
	      System.out.println("Even: " + even);
    }
}
