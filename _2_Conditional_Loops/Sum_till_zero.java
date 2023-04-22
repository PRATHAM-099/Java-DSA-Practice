package _2_Conditional_Loops;

import java.util.Scanner;
import Tools.tools;

public class Sum_till_zero {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        int number, sum = 0;
        do {
            tools.clear();
            System.out.print("\nEnter a number to add || Enter 0 to exit :: ");
            number = in.nextInt();

            sum += number;

            System.out.println("Sum is " + sum);
            tools.pause();
        } while (number != 0);
    }
}