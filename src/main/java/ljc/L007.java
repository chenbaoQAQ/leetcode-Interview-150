package ljc;

public class L007 {
    /**
     * L007: 买卖股票的最佳时机
     * 思路：一次遍历，记录历史最低价格，计算当前价格与最低价的差值
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        // 初始化：最低价设为最大整数，最大利润为 0
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // 更新历史最低价
            minPrice = Math.min(minPrice, price);
            // 尝试在今天卖出，并更新全局最大利润
            maxProfit = Math.max(maxProfit, price - minPrice);
        }
        return maxProfit;
    }
}