package easy;

import java.util.HashMap;

/**
 * Given a string s which consists of lowercase or uppercase letters, return the length of the longest palindrome that can be built with those letters.
 * Letters are case sensitive, for example, "Aa" is not considered a palindrome here.
 */
/*
Runtime 7 ms Beats 53.44%
Memory 42.4 MB Beats 34.94%
 */
public class LongestPalindrome409 {
    public static void main(String[] args) {
        LongestPalindrome409 obj = new LongestPalindrome409();
        System.out.println(obj.longestPalindrome("bb"));
    }

    public int longestPalindrome(String s) {
        if (s.length() == 1) return 1;
        int total = 0;
        boolean middle = false;
        HashMap<Character, Integer> map = countChars(s);

        for (char c : map.keySet()) {
            int charCount = map.get(c);
            if (charCount % 2 == 0)
                total += charCount;
            else {
                total += charCount - (charCount % 2);
                middle = true;
            }
        }
        if (middle) total += 1;
        return total;
    }

    public HashMap<Character, Integer> countChars(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }
}
