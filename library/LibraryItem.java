package library;

public class LibraryItem {
   private String title;
   private int itemId;
   
   public String getTitle()
   {
	   return title;
   }
   public void setTitle(String title)
   {
	   this.title = title;
   }
   public int getItemId()
   {
	   return itemId;
   }
   public void setItemId(int itemId)
   {
	   this.itemId = itemId;
   }
   void displayInfo()
   {
	   System.out.println("Hello your book tiitle is " +title+ " and itme Id is "+ itemId);
   }
   
   public LibraryItem(String title , int itemId)
   {
	   this.title=title;
	   this .itemId= itemId;
   }
   
}
