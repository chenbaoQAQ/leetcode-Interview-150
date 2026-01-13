package ljc.array_string;

import ljc.array_string.L012;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("L012 O(1) 时间插入、删除和获取随机元素测试")
class L012_Text {

    @Test
    @DisplayName("用例 1: 基本功能测试")
    void testBasicFunction() {
        L012.RandomizedSet randomizedSet = new L012.RandomizedSet();

        // 插入 1，返回 true
        assertTrue(randomizedSet.insert(1));
        // 删除 2，不存在返回 false
        assertFalse(randomizedSet.remove(2));
        // 插入 2，返回 true
        assertTrue(randomizedSet.insert(2));

        // getRandom 应随机返回 1 或 2
        int val = randomizedSet.getRandom();
        assertTrue(val == 1 || val == 2);

        // 删除 1，返回 true
        assertTrue(randomizedSet.remove(1));
        // 2 已经在集合中，插入返回 false
        assertFalse(randomizedSet.insert(2));
        // 此时只能返回 2
        assertEquals(2, randomizedSet.getRandom());
    }
}