package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        List<Node> nodes = IntStream.range(0, nums.length)
                .mapToObj(index -> new Node(nums[index], index))
                .sorted().collect(Collectors.toList());

        int j = nums.length - 1;
        for (int i = 0; i < nums.length; ) {
            Node first = nodes.get(i);
            Node last = nodes.get(j);
            int sum = first.getValue() + last.getValue();
            if (sum == target) return new int[]{first.getIndex(), last.getIndex()};
            else if (target > sum) {
                i++;
            } else {
                j--;
            }
        }
        return null;
    }

    static class Node implements Comparable<Node> {
        private final int value;
        private final int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }

        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }

    }
}
