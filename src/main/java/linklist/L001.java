package linklist;

public class L001 {
    public boolean hasCycle(ListNode head) {
        // 如果房间为空，或者只有一个房间且没绳子，肯定没环
        if (head == null || head.next == null) {
            return false;
        }

        // 设定跑步者
        ListNode slow = head;      // 慢指针，走1步
        ListNode fast = head.next; // 快指针，先跑出1步，且每次走2步

        // 只要快指针没撞墙（没遇到 null）
        while (fast != null && fast.next != null) {
            // 逻辑移动
            slow = slow.next;
            fast = fast.next.next;

            // 如果快慢指针相遇了（物理地址一样了）
            if (slow == fast) {
                return true; // 套圈了！有环
            }

        }

        return false; // 快指针跑到了终点，说明无环
    }
}