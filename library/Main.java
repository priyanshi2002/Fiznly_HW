package library;

public class Main {
 
	public static void main(String args[])
	{
		LibraryItem li= new LibraryItem("Ramayan" ,101);
		Book b= new Book ("Ramayan",101,"Valmiki ji ");
		Dvd dvd = new Dvd(180,"Harry Potter",1);
		
		StudentMember sm = new StudentMember(02,"Priyanshi");
		Facultymember fm = new Facultymember("Sakshi",101);
		li.displayInfo();
		b.displayInfo();
		dvd.displayInfo();
		sm.displayInfo();
		fm.displayInfo();
		Book b1= new Book ("Maharbharat",101,"Ganesh ji");
		b1.displayInfo();
	}
}
