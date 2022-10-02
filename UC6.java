//Program to Calculate Wages till a condition of total working hours or days is reached for a month

import java.util.Random;
import java.util.Scanner;
public class UC6 {
    public static void main(String[] args) {
        System.out.println("Enter working hours: ");
        Scanner sc = new Scanner(System.in);
        int wH =sc.nextInt();
        System.out.println("Random value is: ");
        Random r1 = new Random();
        int random = r1.nextInt(10);
        System.out.println(random);

        //initializing and declaring the variables
        int salary;
        int partTime = 4, fullTime = 8;
        int totalSalary = 0;


        //Checking condition if employee is present for full time
        if(random>7) {
            for(int day=1;day<=20;day++) {
                if (wH <= 100) {
                    salary = fullTime * day * wH;
                    totalSalary = totalSalary + salary;
                    System.out.println("Salary of FullTime Employee is: " + totalSalary);
                }
            }
        }

        //Checking condition if employee is present for part time
        else if(random>=3) {
            for (int day=1; day<=20; day++) {
                if (wH <= 100) {
                    salary = partTime * day * wH;
                    totalSalary = totalSalary + salary;
                    System.out.println("Salary of PartTime Employee is: " + totalSalary);
                }
            }
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}


