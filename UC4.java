//Program using Switch-Case

import java.util.Random;
public class UC4 {
    public static final int partTime = 2;
    public static final int fullTime = 1;
    public static final int h = 20;
    public static void main(String[] args){
        Random random = new Random();
        int empHrs, empWage;
        int randomCheck = random.nextInt(4);
        System.out.println("Random value is: "+ randomCheck);
        switch (randomCheck) {
            case fullTime:
                empHrs = 8;
                break;
            case partTime:
                empHrs = 4;
                break;
            default:
                empHrs = 0;
        }
        empWage = (empHrs * h);
        System.out.println("Employee salary is:"+empWage);
    }
}
