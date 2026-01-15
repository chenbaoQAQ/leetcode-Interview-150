package ljc.linklist;

public class L002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = (l1 == null) ? 0 : l1.val;
            int y = (l2 == null) ? 0 : l2.val;

            int sum = x + y + carry;
            carry = sum / 10;

            // 1. 先造出新房间，并接到当前水管后面
            curr.next = new ListNode(sum % 10);
            // 2. 然后手（curr）再挪到新房间上
            curr = curr.next;
            // ----------------

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // 3. 返回 dummy.next，跳过那个初始化的 0
        return dummy.next;
    }
}