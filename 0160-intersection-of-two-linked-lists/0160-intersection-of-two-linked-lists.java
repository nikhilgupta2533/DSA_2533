public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null; 

        ListNode pA = headA; 
        ListNode pB = headB; 

        while (pA != pB) { // 4
            pA = (pA == null) ? headB : pA.next; 
            pB = (pB == null) ? headA : pB.next; 
        }

        return pA; //(could be null or intersection node)
    }
}
