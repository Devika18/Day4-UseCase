//Program to add parttime employee and wage

import java.util.Random;
public class UC3 {
    public static void main(String[] args) {
        Random r = new Random();
        System.out.println("Random value is: ");
        int w = 20;
        int fullTime = 10;
        int partTime = 8;
        int salary;
        int isPresent = r.nextInt(10);
        System.out.println(isPresent);

        //Checking condition for Full time Employee
        if(isPresent>6) {
            salary = w*fullTime;
            System.out.print("Employee is present for FullTime");
            System.out.println();
            System.out.print("Salary of Employee is: "+ salary);
        }

        //Checking condition for Part time Employee
        else if(isPresent>3) {
            salary = w*partTime;
            System.out.print("Employee is present for PartTime");
            System.out.println();
            System.out.print("Salary of Employee is: "+ salary);
        }
        else {
            salary = 0;
            System.out.print("Employee is Absent and salary is: "+ salary);
        }
    }
}
