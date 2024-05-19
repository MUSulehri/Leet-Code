class Solution {
    public int maxProfit(int[] prices) {
        int direct_profit = 0;
        int index = 1;
        int minIndex = 0;
        while (index < prices.length)
        {
            if (direct_profit < (prices[index] - prices[minIndex]))
            {
                direct_profit = prices[index] - prices[minIndex];
            }
            if (prices[index] < prices[minIndex])
            {
                minIndex = index;
            }
            index++;
        }
        index = 1;
        int profit = 0;
        while (index < prices.length)
        {
            if (prices[index] - prices[index - 1] > 0)
            {
                profit += prices[index] - prices[index - 1];
            }
            index++;
        }
        
        
        return profit > direct_profit ? profit : direct_profit;
    }
}