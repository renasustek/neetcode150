package org.example.ArraysAndHashing;

import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer, Integer> map = new HashMap<>();
       for (int i = 0; i < nums.length; i++) {
           if (map.containsKey(target - nums[i])) {
               System.out.println(map.get(target - nums[i]));
               return new int[]{i, map.get(target - nums[i])};
           }
           map.put(nums[i], i);
       }
       return null;
    }
}
