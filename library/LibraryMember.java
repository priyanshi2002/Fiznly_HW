package library;

public abstract class LibraryMember {
    private int memberId;
    private String name;
    
    public String getname()
    {
 	   return name;
    }
    public void setName(String name)
    {
 	   this.name = name;
    }
    public int getMemberId()
    {
 	   return memberId;
    }
    public void setMemberId(int memberId)
    {
 	   this.memberId = memberId;
    }
    void displayInfo()
    {
 	   System.out.println("Hello your name is " + name + " your member id is "+ memberId);
    }
    abstract void borrowItem(LibraryItem item);
   
}
