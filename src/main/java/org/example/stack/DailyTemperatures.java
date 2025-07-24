package org.example.stack;

import java.util.Stack;

public class DailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        // Initialize the result array with the same length as temperatures.
        // Unfound warmer days will remain 0, which is the default.
        int[] result = new int[temperatures.length];

        // Use a single stack to store indices. This is crucial for calculating days.
        Stack<Integer> stack = new Stack<>();

        // Iterate through each temperature using its index
        int i = 0;
        while (i < temperatures.length) { // Loop through all elements, not up to length - 1
            // While the stack is not empty AND the current temperature is warmer
            // than the temperature at the index on top of the stack:
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                // Pop the index from the stack. This is the previous day whose
                // warmer day we've just found.
                int prevDayIndex = stack.pop();

                // Calculate the difference in days and store it in the result array.
                result[prevDayIndex] = i - prevDayIndex;
            }

            // After checking all previous days that are cooler, push the
            // current day's index onto the stack. This maintains the
            // stack as holding indices of temperatures in decreasing order.
            stack.push(i);

            // Move to the next day
            i++;
        }

        // Any indices remaining in the stack at this point mean no warmer
        // temperature was found to their right, so their result remains 0
        // (due to array initialization).

        return result;
    }
}
