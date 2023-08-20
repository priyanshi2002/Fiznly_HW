package programs;

import java.util.Scanner;

public class Student {
   private String name;
   private int age;
   private int studentId;
  
   Student(String name,int age , int studentId)
   {
	   this.name=name;
	   this.age=age;
	   this.studentId = studentId;
	   
	  display();
   }
    public String getName()
    {
    	return name;
    }
    public void setName(String name)
    {
    	this.name=name;
    }
    public int getAge()
    {
    	return age;
    }
    public void setAge(int age)
    {
    	this.age=age;
    }
    public int getStudentId()
    {
    	return studentId;
    }
    public void setStudentId(int studentId)
    {
    	this.studentId=studentId;
    }
    void display() {
    	 System.out.println("Name: " +name + "\nAge: " +age + "\nStudent Id: "+ studentId);
    }
   public static void main(String args[])
   {
	   System.out.println("Enter details here: ");
   
	   Scanner sc= new Scanner(System.in);
	   String name  = sc.nextLine();
	
	   int age = sc.nextInt();
	   int studentId= sc.nextInt();
	   
	    Student s=  new Student(name, age , studentId);
	   
   }
}
