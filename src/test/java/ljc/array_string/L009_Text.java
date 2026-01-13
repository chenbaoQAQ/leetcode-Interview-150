package ljc.array_string;

import ljc.array_string.L009;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L009 跳跃游戏测试")
class L009_Text {

    private final L009 solution = new L009();

    @Test
    @DisplayName("用例 1: 能够到达终点")
    void testExample1() {
        int[] nums = {2, 3, 1, 1, 4};
        // 路径：索引0 -> 索引1 -> 终点
        assertTrue(solution.canJump(nums));
    }

    @Test
    @DisplayName("用例 2: 遇到 0 导致断层")
    void testExample2() {
        int[] nums = {3, 2, 1, 0, 4};
        // 无论怎么跳都会停在索引3（值为0），无法到达索引4
        assertFalse(solution.canJump(nums));
    }

    @Test
    @DisplayName("用例 3: 只有一个元素")
    void testExample3() {
        int[] nums = {0};
        // 起点即终点
        assertTrue(solution.canJump(nums));
    }
}