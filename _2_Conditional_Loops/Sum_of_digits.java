package _2_Conditional_Loops;

import java.util.Scanner;

import Tools.tools;

public class Sum_of_digits {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        System.out.print("Enter a number :: ");
        double n = in.nextDouble();
        int sum = 0;
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Sum of digits of entered number is " + sum);
    }
}
