package library;

public class Book extends LibraryItem 
{
	 private String author;
	 
	 
	public Book(String title, int itemID, String author) {
		super(title, itemID);
		this.author = author;
		//setAuthor(author);
	}
 
  
  public String getAuthor()
  {
	   return author;
  }
  public void setAuthor(String Author)
  {
	   this.author = author;
  }
 
  void displayInfo()
  {
	   System.out.println("The name of the book is "+getTitle()+ " author is "+ getAuthor()+"and itemId is " + getItemId());
  }
 
}
