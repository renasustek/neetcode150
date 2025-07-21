package org.example.twoPointers;

public class ContainWithMostWater {
    public int maxArea(int[] heights) {
        int currentMax = 0;

        int i = 0, j = heights.length - 1;
        while (i < j) {
            int currentArea =  (j-i) * Math.min(heights[i], heights[j]);
            if (currentArea > currentMax) {
                currentMax = currentArea;
            }
            if (heights[i]>heights[j]){
                j--;
            }else {
                i++;
            }
        }
        return currentMax;
    }
}
