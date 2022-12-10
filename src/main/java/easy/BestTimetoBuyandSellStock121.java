package easy;

/*
Runtime 1 ms Beats 100%
Memory 59.1 MB Beats 88.21%
 */

/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */
public class BestTimetoBuyandSellStock121 {
    public static void main(String[] args) {
        int[] prices = new int[]{9, 3, 6, 4, 8, 2, 3, 8, 1, 2};
        System.out.printf("Maximum profit: %d", maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int min = 10000;
        int profit = 0;
        for (int x : prices) {
            min = x < min ? x : min;
            profit = (x - min) > profit ? (x - min) : profit;
        }
        return profit;
    }
}
