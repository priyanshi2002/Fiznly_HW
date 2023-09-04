package exceptionHandling;

public class Employee {
	private String name;
    private String id;
    private String gender;
    private int age;
    private int score;

    public Employee(String name, String id, String gender, int age) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void changeScore(int i){
        score+=i;
    }

    public int getScore() {
        return score;
    }

    public void performTask(){
        System.out.println(getName()+" employee performing task");
        score++;
    }
}
