package easy;

import java.util.HashMap;


/*
Runtime 13 ms Beats 57.89%
Memory 43.1 MB Beats 65.77%
 */
public class RansomNote383 {

    public static void main(String[] args) {
        System.out.println("Can construct? " + canConstruct("a", "ba"));
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> magazineMap = countChars(magazine);
        HashMap<Character, Integer> ransomMap = countChars(ransomNote);
        for (Character c : ransomMap.keySet()) {
            int ransomCount = ransomMap.get(c);
            if (magazineMap.get(c) == null || magazineMap.get(c) < ransomCount) return false;
        }
        return true;
    }

    private static HashMap<Character, Integer> countChars(String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.merge(c, 1, Integer::sum);
        }
        return map;
    }
}
