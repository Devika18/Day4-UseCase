//Program to Check Employee is Present or Absent

import java.util.Random;
public class UC1 {
    public static void main(String[] args) {
        System.out.println("Random value is: ");
        Random random = new Random();
        int r = random.nextInt(5);
        System.out.println(r);
        if(r>3) {
            System.out.println("Employee is Present");
        }
        else {
            System.out.println("Employee is Absent");
        }
    }
}
