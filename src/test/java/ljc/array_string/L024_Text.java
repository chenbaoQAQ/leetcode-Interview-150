package ljc.array_string;

import ljc.array_string.L024;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L024 (LeetCode 68) 文本左右对齐测试")
class L024_Text {

    private final L024 solution = new L024();

    @Test
    @DisplayName("用例 1: 标准分配（包含左侧空格多于右侧的情况）")
    void testExample1() {
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        assertEquals(expected, solution.fullJustify(words, maxWidth));
    }

    @Test
    @DisplayName("用例 2: 密集单词（空格分配不均，左侧多于右侧）")
    void testExample2() {
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        assertEquals(expected, solution.fullJustify(words, maxWidth));
    }

    @Test
    @DisplayName("用例 3: 复杂排版（包含多单词行、单单词行及最后一行）")
    void testExample3() {
        String[] words = {
                "Science","is","what","we","understand","well","enough","to","explain",
                "to","a","computer.","Art","is","everything","else","we","do"
        };
        int maxWidth = 20;
        List<String> expected = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        assertEquals(expected, solution.fullJustify(words, maxWidth));
    }

    @Test
    @DisplayName("用例 4: 单词长度刚好等于 maxWidth")
    void testExample4() {
        String[] words = {"Justify", "text"};
        int maxWidth = 7;
        List<String> expected = Arrays.asList(
                "Justify",
                "text   "
        );
        assertEquals(expected, solution.fullJustify(words, maxWidth));
    }
}