package _1_Basics;

import java.util.Scanner;
import Tools.tools;

public class TypeCasting {
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        tools.clear();

        float n = in.nextFloat();
        int num = (int) (n);

        System.out.println(num);

    }
}
