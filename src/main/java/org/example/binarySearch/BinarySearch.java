package org.example.binarySearch;

public class BinarySearch {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int middle = ((end - start) / 2) + start;


             if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle - 1;
            }else {
                return middle;
            }
        }
        return -1;
    }
}
