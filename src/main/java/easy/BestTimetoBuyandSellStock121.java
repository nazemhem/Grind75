package easy;

/*
Runtime 1 ms Beats 100%
Memory 59.1 MB Beats 88.21%
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
