package _2_Conditional_Loops;

import java.util.Scanner; 
import Tools.tools;

public class Armstrong {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();                                                                                                                             

        System.out.print("Enter a three digit number :: ");
        int n = in.nextInt();
        int armsNumber = 0;
        int number = n;

        while (number > 0) {
            int temp = number % 10;
            temp = temp * temp * temp;
            armsNumber += temp;
            number /= 10;
        }
        System.out.println(armsNumber);
        if (n == armsNumber) {
            System.out.println("Entered number is an armStrong number.");
        } else {
            System.out.println("Entered number isn't an armstrong number.");
        }

    }
}
