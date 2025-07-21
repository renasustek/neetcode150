package org.example.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');

        Stack<Character> stack = new Stack<>();

        if (s.length() % 2 != 0){ return false;}


        for (int i = 0; i < s.length(); i++){
            if (map.containsKey(s.charAt(i)) && stack.empty()){
                return false;
            }
            if (map.containsKey(s.charAt(i))){
                if (stack.peek() == map.get(s.charAt(i))){
                    stack.pop();
                }else {
                    return false;
                }
            }else {
                stack.push(s.charAt(i));
            }

        }
        return stack.empty();
    }
}
