package library;

public class Dvd extends LibraryItem{
	 private int duration;
	 
	  public Dvd (int duration, String title , int itemID)
	  {
		  super(title ,  itemID);
		  this.duration= duration;
	  }
	  public int getduration()
	  {
		   return duration;
	  }
	  public void setduration(int duration)
	  {
		   this.duration = duration;
	  }
	 
	  void displayInfo()
	  {
		   System.out.println("The DVD duration is "+ duration);

	  }
	  
	
}
