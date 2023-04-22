package _2_Conditional_Loops;

import java.util.Scanner;
import Tools.tools;

public class Largest_till_zero {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        int number, largest = 0;
        do {
            tools.clear();
            System.out.print("\nEnter a number to check the largest || Enter 0 to exit :: ");
            number = in.nextInt();

            if (number > largest) {
                largest = number;
            }
        } while (number != 0);

        System.out.println("\nLargest number entered is " + largest);
    }
}
