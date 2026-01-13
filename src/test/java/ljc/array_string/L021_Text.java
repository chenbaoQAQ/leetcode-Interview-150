package ljc.array_string;

import ljc.array_string.L021;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L021 反转字符串中的单词测试")
class L021_Text {

    private final L021 solution = new L021();

    @Test
    @DisplayName("用例 1: 标准情况")
    void testExample1() {
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
    }

    @Test
    @DisplayName("用例 2: 首尾有空格")
    void testExample2() {
        // 输入 "  hello world  "，反转后应去掉多余空格
        assertEquals("world hello", solution.reverseWords("  hello world  "));
    }

    @Test
    @DisplayName("用例 3: 单词间有多个空格")
    void testExample3() {
        // 输入 "a good   example"，单词间只能保留一个空格
        assertEquals("example kids good a", solution.reverseWords("a good   kids   example"));
    }

    @Test
    @DisplayName("用例 4: 只有一个单词")
    void testExample4() {
        assertEquals("world", solution.reverseWords("  world  "));
    }
}