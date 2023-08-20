package programs;

import java.util.Scanner;

public class Employee{
  private int id;
  private String name;
  
  Employee(int id , String name)
  {
	  this.id=id;
	  this.name=name;
  }
  public int getId()
  {
	  return id;
  }
  public void setId(int id)
  {
	  this.id=id;
  }
  public String getName()
  {
	  return name;
  }
  public void setName(String name)
  {
	  this.name=name;
  }
 
}
class Manager extends Employee{
	private  String department;

	public Manager(int id, String name, String department){
		super(id, department);
		this.department=department;
	}
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
   void display()
 {
	System.out.println("Id: " + getId() + "\nName: "+ getName() + "\nDepartment"+ getDepartment()  );
	
  }
}
class Developer extends Employee{
	private String programmingLanguage;

	Developer(int id, String name, String programmingLanguage)
	{
		super(id, programmingLanguage);
		this.programmingLanguage=programmingLanguage;
	}
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
   void display()
    {
	  System.out.println("Id: " + getId() + "\nName: "+ getName()  + "\nProgramming language: "+ getProgrammingLanguage() );
    }
}
class Main{
	public static void main(String args[])
	{
		System.out.println("Enter details here id ,name,department, programming Language ");
		
		
		Scanner sc= new Scanner(System.in);
	
		int id1 = sc.nextInt();
		String name1 = sc.next();
		String department1=sc.next();
		Manager m = new Manager(id1, name1, department1);
		m.display();
		
		int id3 = sc.nextInt();
		String name3 = sc.next();
		String programmingLanguage3 = sc.next();
		Developer d = new Developer(id3, name3, programmingLanguage3);
	
		d.display();
		
		sc.close();
	}
}