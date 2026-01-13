package ljc.array_string;

public class L008 {
    /**
     * L008: 买卖股票的最佳时机 II
     * 核心逻辑：贪心算法。只要明天的价格比今天高值，就进行一次交易。
     * 所有的连续上涨都可以拆解为每一天的增量之和。
     */
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        // 从第二天开始遍历
        for (int i = 1; i < prices.length; i++) {
            // 如果今天比昨天贵，就把差价赚到手
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }
        return maxProfit;
    }
}