package easy;
/*
Runtime 2 ms Beats 69.46%
Memory 42.2 MB Beats 30.61%
 */

/**
 * Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
 * Note that after backspacing an empty text, the text will continue empty.
 */
public class BackspaceStringCompare844 {

    public static void main(String[] args) {
        System.out.println(new BackspaceStringCompare844().getRight("c#d#").equals(new BackspaceStringCompare844().getRight("ab##")));
    }

    public String getRight(String s) {
        StringBuilder builder = new StringBuilder();
        char[] cs = s.toCharArray();
        int skip = 0;
        for (int i = cs.length - 1; i >= 0; i--) {
            char c = cs[i];
            if (c == '#') {
                skip++;
                continue;
            }
            if (skip > 0) {
                skip--;
                continue;
            }
            builder.append(c);
        }
        return builder.reverse().toString();
    }
}
