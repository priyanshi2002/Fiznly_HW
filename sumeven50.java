package forloops;

public class sumeven50 {
	public static void main(String agrs[])
	{
		int even=0;
      for(int i=1 ; i<= 50 ; i++)
      {
    	if(i%2==0)
    	{
    		 even=even+i;
       	  
    	}
      }
      System.out.println(even);
    }
}
