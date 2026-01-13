package ljc.array_string;

import ljc.array_string.L007;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L007 买卖股票的最佳时机测试")
class L007_Text {

    private final L007 solution = new L007();

    @Test
    @DisplayName("用例 1: 利润为 5")
    void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // 第 2 天买入 (1)，第 5 天卖出 (6)，利润 5
        assertEquals(5, solution.maxProfit(prices));
    }

    @Test
    @DisplayName("用例 2: 利润为 0")
    void testExample2() {
        int[] prices = {7, 6, 4, 3, 1};
        // 价格一直在跌，不交易，利润 0
        assertEquals(0, solution.maxProfit(prices));
    }
}