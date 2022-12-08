package easy;

import java.util.LinkedList;
import java.util.NoSuchElementException;

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
