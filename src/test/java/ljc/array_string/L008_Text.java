package ljc.array_string;

import ljc.array_string.L008;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L008 买卖股票的最佳时机 II 测试")
class L008_Text {

    private final L008 solution = new L008();

    @Test
    @DisplayName("用例 1: 多次交易获取利润")
    void testExample1() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        // 1买5卖赚4，3买6卖赚3，总利润 7
        assertEquals(7, solution.maxProfit(prices));
    }

    @Test
    @DisplayName("用例 2: 连续上涨")
    void testExample2() {
        int[] prices = {1, 2, 3, 4, 5};
        // 每天都卖再买，总利润 4
        assertEquals(4, solution.maxProfit(prices));
    }

    @Test
    @DisplayName("用例 3: 持续下跌")
    void testExample3() {
        int[] prices = {7, 6, 4, 3, 1};
        assertEquals(0, solution.maxProfit(prices));
    }
}