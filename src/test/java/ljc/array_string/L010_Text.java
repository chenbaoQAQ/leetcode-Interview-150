package ljc.array_string;

import ljc.array_string.L010;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L010 跳跃游戏 II 测试")
class L010_Text {

    private final L010 solution = new L010();

    @Test
    @DisplayName("用例 1: [2,3,1,1,4]")
    void testExample1() {
        int[] nums = {2, 3, 1, 1, 4};
        // 最佳方案：跳到索引 1，再跳到终点，共 2 步
        assertEquals(2, solution.jump(nums));
    }

    @Test
    @DisplayName("用例 2: [2,3,0,1,4]")
    void testExample2() {
        int[] nums = {2, 3, 0, 1, 4};
        assertEquals(2, solution.jump(nums));
    }
}