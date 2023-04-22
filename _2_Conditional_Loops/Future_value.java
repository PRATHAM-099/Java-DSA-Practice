package _2_Conditional_Loops;

import java.util.Scanner;

import Tools.tools;

public class Future_value {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        System.out.print("Enter the present value :: ");
        double present_value = in.nextDouble();

        System.out.print("Enter the rate of intrust :: ");
        int rate_of_interest = in.nextInt();

        System.out.print("Enter the number of periods :: ");
        int time = in.nextInt();

        double future_value = present_value * (Math.pow((1 + rate_of_interest / 100), time));

        System.out.println("Future value = " + future_value);
    }

}
