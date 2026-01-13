package ljc.array_string;

import ljc.array_string.L023;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L023 第一个匹配项下标测试")
class L023_Text {

    private final L023 solution = new L023();

    @Test
    @DisplayName("用例 1: 标准匹配")
    void testExample1() {
        // haystack = "sadbutsad", needle = "sad"
        // 第一个 "sad" 出现在下标 0
        assertEquals(0, solution.strStr("sadbutsad", "sad"));
    }

    @Test
    @DisplayName("用例 2: 不存在匹配项")
    void testExample2() {
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }

    @Test
    @DisplayName("用例 3: 你提到的重叠匹配 (ssad vs sad)")
    void testExample3() {
        // 第一个 s 不匹配后面的 a，快指针 i 应该移动到第二个 s 重新开始
        assertEquals(1, solution.strStr("ssad", "sad"));
    }

    @Test
    @DisplayName("用例 4: needle 长度大于 haystack")
    void testExample4() {
        assertEquals(-1, solution.strStr("abc", "abcd"));
    }

    @Test
    @DisplayName("用例 5: 匹配项在字符串末尾")
    void testExample5() {
        assertEquals(2, solution.strStr("abcde", "cde"));
    }
}