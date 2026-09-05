class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        for i in range(len(prices)-1, 0, -1):
            for j in range(i-1,-1,-1):
                if prices[i] - prices[j] > profit:
                    profit = prices[i]-prices[j]
        return profit
