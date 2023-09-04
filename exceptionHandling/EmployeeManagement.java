package exceptionHandling;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeManagement {
	private  Map<String , List<Employee>> employeeList;

    EmployeeManagement(){
        employeeList = new HashMap<>();
        employeeList.put("Housekeeping",new ArrayList<>());
        employeeList.put("Maintenance",new ArrayList<>());
        employeeList.put("Frontdesk",new ArrayList<>());
        employeeList.put("kitchen",new ArrayList<>());
    }

    public void hireEmployee(String category, String name, String id,String gender, int age) throws DuplicateEmployeeException {
        Employee employee;
        if(category.equals("Housekeeping")){
            employee = new HousekeepingEmployee(name,id, gender, age);
        }else if(category.equals("Maintenance")){
            employee  =new MaintenanceEmployee(name,id,gender,age);
        }else if(category.equals("Frontdesk")){
            employee = new FrontDeskEmployee(name, id,gender, age);
        }else if(category.equals("kitchen")){
            employee = new KitchenEmployee(name,id, gender, age);
        }else{
            throw  new IllegalArgumentException("Invalid employee category: "+category);
        }
        boolean found = false;
        if(employeeList.containsKey(category)){
            for(List<Employee> emp: employeeList.values()){
                for(Employee e : emp){
                    if(e.getId().equals(id)){
                        found=true;
                        throw new DuplicateEmployeeException("Already a employee exists in this id");
                    }
                }
            }
        }
        if(!found){
            employeeList.get(category).add(employee);
            System.out.println("Employee added successully in "+category+" department");
        }
    }

    public void fireEmployee(String category, String id){
        Employee employee = null;
        if (!employeeList.containsKey(category)){
            throw new IllegalArgumentException("Invalid employee category: "+category);
        }else{
            for(Employee emp: employeeList.get(category)){
                if(emp.getId().equals(id)){
                    employee=emp;
                }
            }
            employeeList.get(category).remove(employee);
            System.out.println("Employee removed successfully");
        }
    }
    public void changeDetails(String changeType, String changeValue,String category, String id){

        if (!employeeList.containsKey(category)){
            throw new IllegalArgumentException("Invalid employee category: "+category);
        }else{
            if(changeType.equals("name")){
                for(Employee emp: employeeList.get(category)){
                    if(emp.getId().equals(id)){
                        System.out.print("Name changed from "+emp.getName());
                        emp.setName(changeValue);
                        System.out.println("to "+emp.getName());
                    }
                }

            }
            if(changeType.equals("gender")){
                for(Employee emp: employeeList.get(category)){
                    if(emp.getId().equals(id)){
                        System.out.print("Gender changed from "+emp.getGender());
                        emp.setGender(changeValue);
                        System.out.println(" to "+emp.getGender());
                    }
                }

            }
            if(changeType.equals("age")){
                for(Employee emp: employeeList.get(category)){
                    if(emp.getId().equals(id)){
                        System.out.print("Age changed from "+emp.getAge());
                        emp.setAge(Integer.parseInt(changeValue));
                        System.out.println("to "+emp.getAge());
                    }
                }
            }
        }
    }

    public void assignTask(String category, String id) throws InvalidTaskAssignmentException {
        if(!employeeList.containsKey(category)){
            throw new IllegalArgumentException("Invalid employee category: "+category);
        }
        boolean found = false;
        for(Employee emp:employeeList.get(category)){
            if(emp.getId().equals(id)){
                emp.performTask();
                found = true;
            }
        }
        if(!found){
            throw new InvalidTaskAssignmentException("Employee with ID " + id + " not found in category " + category);
        }
    }

    public void performanceReport(){
        Employee highScore = new Employee("null","i","null",0);
        for(List<Employee> empLists: employeeList.values()){
            for(Employee emp :empLists){
                if(emp.getScore()>highScore.getScore()){
                    highScore =emp;
                }
            }
        }
        if(!highScore.getName().equals("null")){
            System.out.println("Leading employee with score "+highScore.getScore()+" is "+highScore.getName()+" id "+highScore.getId());
        }else{
            System.out.println("All are in equal level");
        }
        for(List<Employee> empLists: employeeList.values()){
            for(Employee employee: empLists){
                System.out.println(employee.getName()+" with score "+employee.getScore());
            }
        }
    }
}
