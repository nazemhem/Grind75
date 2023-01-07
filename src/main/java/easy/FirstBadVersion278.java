package easy;

import java.util.Arrays;
import java.util.List;

/**
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check. Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 * Suppose you have n versions [1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 * You are given an API bool isBadVersion(version) which returns whether version is bad. Implement a function to find the first bad version. You should minimize the number of calls to the API.
 */
/*
Runtime 15 ms Beats 99.94%
Memory 39.1 MB Beats 80.75%
 */
public class FirstBadVersion278 {
    private static final List<Boolean> versions;

    static {
        versions = Arrays.asList(false, false, false, false, true, true, true);
    }


    public static void main(String[] args) {
        System.out.println(firstBadVersion(7));
    }

    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static boolean isBadVersion(int version) {
        return versions.get(version - 1);
    }
}
