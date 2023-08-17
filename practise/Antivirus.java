package practise;

 public class Antivirus {
    
	 public Antivirus()
	 {
		 System.out.println("You are using free version please upgrade");
	 }
	 
	 
	 public Antivirus(Transaction transaction)
	 {
		 if(transaction!=null)
		 {
			 System.out.println("You have done with transaction enjoy upgraded version and your product key is "+ transaction.productKey);
		 }else {
			 System.out.println("Transaction is still not done yet");
		 }
	 }
	 
   public static void main(String agrs[])
   {
	   Transaction transaction = new Transaction();
	   Antivirus paid= new Antivirus(transaction);
   }
}
 