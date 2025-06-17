package org.example.ArraysAndHashing;

import java.util.*;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        for (int i = 0; i < s.length(); i++) {
            if (sChar[i] != tChar[i]) {
                return false;
            }
        }
        return true;
    }
}
