package _2_Conditional_Loops;

import java.util.Scanner;

import Tools.tools;

public class Leap_year {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        System.out.print("Enter the year :: ");
        double year = in.nextDouble();

        if (year % 4 == 0) {
            System.out.println("Entered year is a leap year.");
        } else {
            System.out.println("Entered year is not a leap year.");
        }
    }
}
