package _2_Conditional_Loops;

import java.util.Scanner; 
import Tools.tools;

public class No_of_number {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();                                                                                                                             

        System.out.print("Enter an integer ::");
        int n = in.nextInt();
        System.out.print("Enter the num you want number of :: ");
        int x = in.nextInt();
        int count = 0;

        while (n > 0) {
            if (n % 10 == x) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
