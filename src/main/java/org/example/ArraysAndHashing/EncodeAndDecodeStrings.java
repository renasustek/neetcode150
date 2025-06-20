package org.example.ArraysAndHashing;

import com.sun.jdi.ClassType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EncodeAndDecodeStrings {


    // A simpler, more robust encoding format
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    // A parser-based decode method that handles any length
    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0; // i is our main pointer, moving through the encoded string

        while (i < s.length()) {
            // j will find the position of the '#' delimiter
            int j = i;
            while (j < s.length() && s.charAt(j) != '#') {
                j++;
            }

            // Now, the characters between i and j form the length string (e.g., "4" or "11")
            String lengthStr = s.substring(i, j);
            int length = Integer.parseInt(lengthStr);

            // The actual string starts right after the '#' and has the specified length
            String actualStr = s.substring(j + 1, j + 1 + length);
            result.add(actualStr);

            // Move our main pointer i past the string we just decoded to the start of the next length
            i = j + 1 + length;
        }

        return result;
    }
}
