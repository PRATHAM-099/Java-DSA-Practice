package _2_Conditional_Loops;

import java.util.Scanner;
import Tools.tools;

public class Calculator {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        do {
            tools.clear();
            System.out.println("\nCALCULATOR");
            System.out.print("\nEnter an operator :: ");
            char op = in.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                System.out.print("Enter two numbers :: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                int ans = 0;

                if (op == '+') {
                    ans = num1 + num2;
                } else if (op == '-') {
                    ans = num1 - num2;
                } else if (op == '*') {
                    ans = num1 * num2;
                } else if (op == '/') {
                    ans = num1 / num2;
                } else if (op == '%') {
                    ans = num1 % num2;
                } else {
                    System.out.print("Enter a valid operator.");
                }
                System.out.println(ans);
                tools.pause();

            } else if (op == 'x' || op == 'X') {
                break;
            }
        } while (true);

    }
}
