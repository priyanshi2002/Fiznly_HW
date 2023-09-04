package exceptionHandling;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to Employee Management System");
        EmployeeManagement employeeManagement= new EmployeeManagement();
        int option;
        while(true){
            System.out.println("Select an option\n| 1 Hire employee\n| 2 Modify employee detail\n" +
                    "| 3 Assign Task\n| 4 Performance result\n| 5 Fire employee\n| 6 Exit");
            option = sc.nextInt();
            sc.nextLine();
            if(option==1){
                System.out.println("Enter employee name: ");
                String name = sc.nextLine();
                System.out.println("Enter employee category (Housekeeping Maintenance Frontdesk kitchen)");
                String category = sc.nextLine();
                System.out.println("Enter employee Id: ");
                String id= sc.nextLine();
                System.out.println("Enter employee age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter employee gender: ");
                String gender = sc.nextLine();
                try {
                    employeeManagement.hireEmployee(category,name,id,gender,age);
                } catch (DuplicateEmployeeException | IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (option==2) {
                System.out.println("Enter category");
                String category = sc.nextLine();
                System.out.println("Enter ID");
                String id= sc.nextLine();
                System.out.println("What you are going to change ? \nname\nage\ngender");
                String changeType = sc.nextLine();
                System.out.println("Enter the value to change");
                String changeValue = sc.nextLine();
                employeeManagement.changeDetails(changeType,changeValue,category,id);
            }else if(option==3){
                System.out.println("Enter the category : ");
                String category = sc.nextLine();
                System.out.println("Enter employee ID : ");
                String id = sc.nextLine();
                try {
                    employeeManagement.assignTask(category,id);
                } catch (InvalidTaskAssignmentException e) {
                    System.out.println(e.getMessage());
                }
            } else if (option==4) {
                employeeManagement.performanceReport();
            } else if (option==5) {
                System.out.println("Enter the category");
                String category = sc.nextLine();
                System.out.println("Enter employee id");
                String id = sc.nextLine();
                employeeManagement.fireEmployee(category,id);
            } else if (option==6) {
                System.out.println("Thank you");
                break;
            } else{
                System.out.println("Please enter a valid option");
            }


        }


    }
}