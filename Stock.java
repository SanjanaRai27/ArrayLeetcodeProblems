// Find the maximum profit you can achieve from one transaction.

public class Stock{
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; // Minimum price seen so far
        int maxProfit = 0; // Maximum profit seen so far

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price; // Update minimum price
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice; // Update maximum profit
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        Stock solution = new Stock();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println("Max Profit: " + solution.maxProfit(prices)); // Output: 5
    }
}

