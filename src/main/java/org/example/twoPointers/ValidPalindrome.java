package org.example.twoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toLowerCase().toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (i < j && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }

            if (chars[i] != chars[j]) {
                return false;
            }
            i++;
            j--;
        }



        return true;
    }
}

