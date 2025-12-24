package ljc;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class L020_Text {

    private final L020 solution = new L020();

    @Test
    @DisplayName("Example 1: flower, flow, flight -> fl")
    void example1() {
        String[] strs = {"flower", "flow", "flight"};
        assertEquals("fl", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Example 2: dog, racecar, car -> empty")
    void example2() {
        String[] strs = {"dog", "racecar", "car"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Single string -> itself")
    void singleString() {
        String[] strs = {"abc"};
        assertEquals("abc", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Contains empty string -> empty")
    void containsEmptyString() {
        String[] strs = {"", "b", "bc"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("All same strings -> full string")
    void allSame() {
        String[] strs = {"test", "test", "test"};
        assertEquals("test", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("No common prefix because first char differs -> empty")
    void noCommonPrefix() {
        String[] strs = {"a", "b", "c"};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Prefix equals one whole string -> that string")
    void prefixEqualsWholeString() {
        String[] strs = {"ab", "abccc", "abdd"};
        assertEquals("ab", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Null / empty array handling (choose your policy)")
    void emptyArrayPolicy() {
        // 你可以选择：
        // 1) 空数组返回 ""（推荐）
        // 2) 空数组抛 IllegalArgumentException
        //
        // 这里先按“返回空串”的策略写断言
        String[] strs = {};
        assertEquals("", solution.longestCommonPrefix(strs));
    }

    @Test
    @DisplayName("Null input policy (choose your policy)")
    void nullPolicy() {
        // 同上：你可以选择返回 "" 或抛异常
        // 这里先按“返回空串”
        assertEquals("", solution.longestCommonPrefix(null));
    }
}
