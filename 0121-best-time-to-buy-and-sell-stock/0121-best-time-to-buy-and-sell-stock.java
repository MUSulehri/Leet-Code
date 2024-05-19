class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int index = 1;
        int minIndex = 0;
        while (index < prices.length)
        {
            if (profit < (prices[index] - prices[minIndex]))
            {
                profit = prices[index] - prices[minIndex];
            }
            if (prices[index] < prices[minIndex])
            {
                minIndex = index;
            }
            index++;
        }
        
        return profit;
    }
}