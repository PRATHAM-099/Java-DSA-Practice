package _2_Conditional_Loops;

import java.util.Scanner;

import Tools.tools;

public class LCM_HCF {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        int dividend, divisor, remainder = 1;

        System.out.print("Enter two number :: ");
        int a = in.nextInt();
        int b = in.nextInt();

        if (a > b) {
            dividend = a;
            divisor = b;
        } else {
            dividend = b;
            divisor = a;
        }

        while (remainder != 0) {
            remainder = dividend % divisor;
            if (remainder == 0) {
                break;
            } else {
                dividend = divisor;
                divisor = remainder;
            }
        }
        int hcf = divisor;
        System.out.println(("LCM = " + (a * b) / hcf));
        System.out.println("HCF = " + hcf);

    }
}
