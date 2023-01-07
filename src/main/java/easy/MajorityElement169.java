package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.
 */
/*
Runtime 9 ms Beats 51.74%
Memory 48 MB Beats 59.86%
 */
public class MajorityElement169 {

    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        MajorityElement169 obj = new MajorityElement169();
        System.out.println(obj.majorityElement(nums));

    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = count(nums);
        for (Map.Entry<Integer, Integer> en : map.entrySet()) {
            if (en.getValue() > nums.length / 2) return en.getKey();
        }
        return -1;
    }

    public HashMap<Integer, Integer> count(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.merge(i, 1, Integer::sum);
        }
        return map;
    }

}
