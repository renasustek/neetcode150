package org.example.ArraysAndHashing;

import com.sun.jdi.ClassType;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EncodeAndDecodeStrings {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(":"+str.length()+":"+str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

        HashMap<Character, Integer> numMap = new HashMap<>();
        numMap.put('0', 0);
        numMap.put('1', 1);
        numMap.put('2', 2);
        numMap.put('3', 3);
        numMap.put('4', 4);
        numMap.put('5', 5);
        numMap.put('6', 6);
        numMap.put('7', 7);
        numMap.put('8', 8);
        numMap.put('9', 9);

        char[] strToChar = str.toCharArray();
        for (int i = 0; i < strToChar.length; i++) {
            if (strToChar[i] == ':' && numMap.containsKey(strToChar[i+1]) && strToChar[i + 2] == ':') {
                int endCheck = i+numMap.get(strToChar[i+1])+2;
                StringBuilder sb = new StringBuilder();
                for (int j = i+3; j <= endCheck; j++) {
                    sb.append(strToChar[j]);
                }
                result.add(sb.toString());
                i=endCheck;
            }
        }
        return result;
    }
}
