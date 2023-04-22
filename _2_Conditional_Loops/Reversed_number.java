package _2_Conditional_Loops;

import java.util.Scanner; 
import Tools.tools;

public class Reversed_number {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();                                                                                                                             

        System.out.print("Enter a number :: ");
        int number = in.nextInt();

        int last_digit = 0;

        while (number > 0) {
            last_digit = number % 10;
            number = number / 10;

            System.out.print(last_digit);
        }
    }
}
