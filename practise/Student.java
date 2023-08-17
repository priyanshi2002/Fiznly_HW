package practise;

public class Student {
	private int studentID;
    private String name;
    private static int totalStudents = 0;

    public Student(String name) {
        this.studentID = ++totalStudents;
        this.name = name;
    }

    public void enrollStudent() {
        System.out.println("Enrolling student: " + name);
        //totalStudents++;
    }

    public void dropStudent() {
        System.out.println("Dropping student: " + name);
        totalStudents--;
    }

    public static int getTotalStudents() {
        return totalStudents;
    }

   
    public String toString() {
        return "Student ID: " + studentID + "\nName: " + name;
    }
	public static void main(String[] args) {
        Student student1 = new Student("Priyanshi");
        Student student2 = new Student("Lavish");

        System.out.println("Total students: " + Student.getTotalStudents());

        student1.enrollStudent();
        student2.enrollStudent();

        student2.dropStudent();

        System.out.println("\nTotal students: " + Student.getTotalStudents());

        System.out.println("\nStudent 1 Details:\n" + student1);
        System.out.println("\nStudent 2 Details:\n" + student2);
    }

}
