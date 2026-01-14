package linklist;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class L001_Text {
    private final L001 solution = new L001();

    @Test
    @DisplayName("用例 1: 存在环的情况 (3 -> 2 -> 0 -> -4 -> 回到 2)")
    void testHasCycle() {
        // 1. 创建节点（物理房间）
        ListNode head = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);

        // 2. 接绳子（构建链表结构）
        head.next = node2;
        node2.next = node3;
        node3.next = node4;

        // 3. 制造环：把末尾节点的 next 指向之前的某个节点
        node4.next = node2;

        // 验证结果
        assertTrue(solution.hasCycle(head), "这个链表是有环的，应该返回 true");
    }

    @Test
    @DisplayName("用例 2: 无环的普通链表 (1 -> 2)")
    void testNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertFalse(solution.hasCycle(head), "这个链表没有环，应该返回 false");
    }

    @Test
    @DisplayName("用例 3: 边界情况 - 空链表或只有一个节点")
    void testEdgeCases() {
        // 空链表
        assertFalse(solution.hasCycle(null));

        // 只有一个节点且没指向自己
        assertFalse(solution.hasCycle(new ListNode(1)));
    }
}
