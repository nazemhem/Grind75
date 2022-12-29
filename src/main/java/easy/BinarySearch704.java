package easy;

import java.util.Arrays;
/*
Runtime 0 ms Beats100%
Memory 42.7 MB Beats 96.59%
 */

/**
 * Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists,
 * then return its index. Otherwise, return -1.
 * You must write an algorithm with O(log n) runtime complexity.
 */
public class BinarySearch704 {

    public static void main(String[] args) {
        int[] nums = new int[]{5};
        int target = 5;
        //Explanation: 9 exists in nums and its index is 4
        System.out.printf("%d exist in array %s with index %d", target, Arrays.toString(nums), search(nums, target));
    }

    private static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (nums[middle] == target) return middle;
            else if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) end = middle - 1;
        }
        return -1;

        /*
        RECURSIVE SOLUTION
        return search(nums, target, 0, nums.length - 1);
        */
    }

    /**
     * Recursive Solution
     */
    private static int search(int[] nums, int target, int start, int end) {
        if (end < start) return -1;
        int middle = (end + start) / 2;
        if (nums[middle] == target) return middle;
        else if (target > nums[middle]) return search(nums, target, middle + 1, end);
        else return search(nums, target, start, middle - 1);
    }
}
