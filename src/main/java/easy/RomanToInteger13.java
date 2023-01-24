package easy;
/*
Runtime 4 ms Beats 88.37%
Memory 42.3 MB Beats 91.5%
 */

/**
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 */
public class RomanToInteger13 {

    public static void main(String[] args) {
        System.out.println(new RomanToInteger13().romanToInt("III"));
    }

    public int romanToInt(String s) {
        int sum = 0;
        char[] cs = s.toCharArray();
        for (int i = 0; i < cs.length; i++) {
            char current = cs[i];
            Character next = null;
            if (i < cs.length - 1)
                next = cs[i + 1];
            if (current == 'I') {
                if (next != null && (next == 'V' || next == 'X')) {
                    sum -= 1;
                } else {
                    sum += 1;
                }
            }
            if (current == 'V') {
                sum += 5;
            }
            if (current == 'X') {
                if (next != null && (next == 'L' || next == 'C')) {
                    sum -= 10;
                } else {
                    sum += 10;
                }
            }
            if (current == 'C') {
                if (next != null && (next == 'D' || next == 'M')) {
                    sum -= 100;
                } else {
                    sum += 100;
                }
            }
            if (current == 'L') {
                sum += 50;
            }
            if (current == 'D') {
                sum += 500;
            }
            if (current == 'M') {
                sum += 1000;
            }

        }
        return sum;
    }
}
