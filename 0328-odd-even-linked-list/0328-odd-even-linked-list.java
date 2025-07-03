class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // save starting point of even list

        while (even != null && even.next != null) {
            odd.next = even.next;     // skip even
            odd = odd.next;

            even.next = odd.next;     // skip odd
            even = even.next;
        }

        odd.next = evenHead; // attach even list after odd list
        return head;
    }
}
