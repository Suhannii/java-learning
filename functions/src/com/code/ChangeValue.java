package com.code;

import java.util.Arrays;
import java.util.EnumSet;

public class ChangeValue {
    static void main(String[] args) {
        // create an array
        int[] arr = {1, 2, 3, 4, 5, 6};
        change(arr);
        System.out.println(Arrays.toString(arr));

    }

    private static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object vio this ref variable, same object will be changed

    }


}
