package com.learnjava.dsa;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};

        TwoSum twoSum = new TwoSum();

        int[] result = twoSum.twoSum(nums, 9);
        Arrays.stream(result).forEach(System.out::println);
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int targetNum = target - nums[i];
            if(integerIntegerMap.containsKey(targetNum) &&
                integerIntegerMap.get(targetNum) != i){
                return new int[] {integerIntegerMap.get(targetNum), i};
            }
            integerIntegerMap.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }
}
