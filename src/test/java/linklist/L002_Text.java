package linklist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("链表模块 - L002 (两数相加) 测试")
class L002_Text {

    private final L002 solution = new L002();

    @Test
    @DisplayName("标准用例: 342 + 465 = 807")
    void testStandardAdd() {
        // 构造 l1: 2 -> 4 -> 3 (表示 342)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        // 构造 l2: 5 -> 6 -> 4 (表示 465)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        ListNode result = solution.addTwoNumbers(l1, l2);

        // 验证结果: 7 -> 0 -> 8 (表示 807)
        assertNotNull(result);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next); // 确认链表在此结束
    }

    @Test
    @DisplayName("进位用例: 99 + 1 = 100")
    void testCarryAdd() {
        // 9 -> 9
        ListNode l1 = new ListNode(9, new ListNode(9));
        // 1
        ListNode l2 = new ListNode(1);

        ListNode result = solution.addTwoNumbers(l1, l2);

        // 结果应该是 0 -> 0 -> 1
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
    }
}