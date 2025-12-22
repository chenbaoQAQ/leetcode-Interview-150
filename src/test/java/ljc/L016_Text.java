package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * L016 接雨水测试类
 * 严格按照你的目录结构习惯：包名为 ljc，类名为 L016_Text
 */
@DisplayName("L016 接雨水功能测试")
class L016_Text {

    private final L016 solution = new L016();

    @Test
    @DisplayName("典型案例：包含多个凹槽")
    void testStandardCase() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // 预期能够接到 6 单位的水
        assertEquals(6, solution.trap(height));
    }

    @Test
    @DisplayName("U型案例：中间深两边高")
    void testUPlan() {
        int[] height = {4, 2, 0, 3, 2, 5};
        // 预期能够接到 9 单位的水
        assertEquals(9, solution.trap(height));
    }

    @Test
    @DisplayName("边界案例：单调递增或递减（无法接水）")
    void testNoWater() {
        int[] increase = {1, 2, 3, 4, 5};
        int[] decrease = {5, 4, 3, 2, 1};

        assertEquals(0, solution.trap(increase));
        assertEquals(0, solution.trap(decrease));
    }

    @Test
    @DisplayName("特殊案例：空数组或高度不足")
    void testEdgeCases() {
        assertEquals(0, solution.trap(new int[]{}));
        assertEquals(0, solution.trap(new int[]{1, 2}));
    }
}