package library;

public class Facultymember extends LibraryMember{

	public Facultymember(String name , int memberId)
	{
		this.setName(name);
		this.setMemberId(memberId);
	
	}
	
	void borrowItem(LibraryItem li)
	{
		System.out.println(li.getItemId()+" ");
		System.out.println(li.getTitle()+" ");
	//	System.out.println("The nam eof member is : "+ name + "and member id is : "+ memberId);
	}
}
