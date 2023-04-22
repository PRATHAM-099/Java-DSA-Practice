package _2_Conditional_Loops;

import java.util.Scanner;
import Tools.tools;

public class Factors {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        System.out.print("Enter number you want factors of :: ");
        int number = in.nextInt();

        System.out.println("\nFactors of " + number + " are :-");
        for (int i = 1; i <= number; i++) {

            if (number % i == 0) {
                System.out.println(i);
            }
        }

    }
}
