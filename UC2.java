//Program to calculate daily employee wage

import java.util.Random;
public class UC2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Random value is: ");
        int salary;
        int w = 20;                                     //wage per hour is 20
        int h = 8;                                      //full day hour is 8

        int isPresent = random.nextInt(10);
        System.out.println(isPresent);


        if(isPresent>=5) {
            salary = w*h;
            System.out.println("Employee is Present and Salary of Employee is: " +salary);
        }
        else {
            salary = 0;
            System.out.println("Employee is Absent and salary of employee is: "+ salary);
        }
    }
}
