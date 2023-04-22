package _4_Arrays;

import java.util.Arrays;

import Tools.tools;

public class build_array_from_purmutation {

    public static void main(String[] args) {
        tools.clear();

        int[] nums = { 0, 2, 1, 5, 3, 4 };
        System.out.println(Arrays.toString(nums));
        int[] arr= new int[nums.length];

        for(int i=0;i<nums.length;i++){

            arr[i] = nums[nums[i]];
        }
        
        System.out.println(Arrays.toString(arr));
        }
}
