package easy;

import java.util.LinkedList;
import java.util.NoSuchElementException;
/*
Runtime 3 ms Beats 77.8%
Memory 41.9 MB Beats 57.28%
 */

/**
 *Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses20 {

    public static void main(String[] args) {
        String test = "([)]";

        System.out.println(isValid(test));
    }

    public static boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        try {
            for (Character c : s.toCharArray()) {
                switch (c) {
                    case ')': {
                        if (stack.pop() != '(') return false;
                        break;
                    }
                    case '}': {
                        if (stack.pop() != '{') return false;
                        break;
                    }
                    case ']': {
                        if (stack.pop() != '[') return false;
                        break;
                    }
                    default:
                        stack.push(c);
                }
            }
        } catch (NoSuchElementException e) {
            return false;
        }
        return stack.size() == 0;
    }
}
