package library;

public class StudentMember extends LibraryMember {
 
	StudentMember(int memberId, String name)
	{
		this.setMemberId(memberId);
		this.setName(name);
	}
	
	void borrowItem(LibraryItem li)
	{
		System.out.println(li.getTitle()+" ");
		System.out.println(li.getItemId()+ " ");
	}
}