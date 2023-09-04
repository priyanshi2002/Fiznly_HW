package exceptionHandling;

public class HousekeepingEmployee extends Employee{

    public HousekeepingEmployee(String name,String id, String gender, int age) {
        super(name,id, gender, age);
    }

    public String getName(){
        return super.getName();
    }

    public String getGender(){
        return super.getGender();
    }

    public String getID(){
        return super.getId();
    }

    public int getAge(){
        return super.getAge();
    }

    public void setName(String name){
        super.setName(name);
    }

    public void setGender(String gender){
        super.setGender(gender);
    }

    public void setAge(int age){
        super.setAge(age);
    }

    public void setId(String id){
        super.setId(id);
    }

    @Override
    public void performTask() {
        System.out.println(getName() + " is cleaning.");
        changeScore(1);
    }
}
