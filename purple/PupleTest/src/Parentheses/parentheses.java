package Parentheses;

import java.util.Stack;

public class parentheses {

    public static boolean ParenthesesBalance(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty()) {
                    return false; 
                }
                stack.pop();
            }
        }

        return stack.isEmpty(); 
        }

    public static void main(String[] args) {
        String s = "))((()))((";
        boolean balanced = ParenthesesBalance(s);

        if (balanced) {
            System.out.println("Parentheses are balanced.");
        } else {
            System.out.println("Parentheses are not balanced.");
        }
    }
}