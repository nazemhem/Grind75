package easy;
/*
Runtime 668 ms Beats 33.84%
Memory 43 MB Beats 87.80%
 */

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters,
 * it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * Given a string s, return true if it is a palindrome, or false otherwise.
 */
public class ValidPalindrome125 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

    public static boolean isPalindrome(String s) {
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int end = str.length() - 1;
        for (int start = 0; start < str.length() / 2; start++) {
            if (str.charAt(start) != str.charAt(end)) return false;
            end--;
        }
        return true;
    }
}
