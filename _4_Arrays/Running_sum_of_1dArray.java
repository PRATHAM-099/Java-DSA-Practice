package _4_Arrays;

import java.util.Arrays;

import Tools.tools;

public class Running_sum_of_1dArray {

    public static void main(String[] args) {
        tools.clear();

        int[] nums = { 1, 2, 3, 4 };

        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}
