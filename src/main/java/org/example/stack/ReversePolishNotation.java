package org.example.stack;

import java.util.Stack;

public class ReversePolishNotation {


    /*
    *
    *"1","2","+","3","*","4","-"]
    *
    *
    * */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String token: tokens){
            if (token.matches("^-?(1000|[1-9]?[0-9]?[0-9]?[0-9])$")){
                int number = Integer.parseInt(token);
                stack.push(number);
            } else {
                int number2 = stack.pop();
                int  number1 = stack.pop();
                int result;
                switch (token){
                    case "+" -> result = number1+number2;
                    case "-" -> result = number1-number2;
                    case "*" -> result = number1*number2;
                    case "/" -> result = number1/number2;
                    default -> result = -1;
                }

                stack.push(result);
            }
        }
        return stack.peek();
    }
}
