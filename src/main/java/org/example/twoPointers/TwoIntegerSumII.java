package org.example.twoPointers;

public class TwoIntegerSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while (i < j) {
            if (numbers[i]+numbers[j] > target){
                j--;
            }
            if (numbers[i]+numbers[j] < target){
                i++;
            }
            if (numbers[i]+numbers[j] == target){
                break;
            }


        }
        return new int[]{i+1, j+1};
    }

}
