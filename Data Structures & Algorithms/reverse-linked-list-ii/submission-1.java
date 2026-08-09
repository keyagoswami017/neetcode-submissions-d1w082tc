/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode leftPrev = dummy;
        ListNode curr = head;

        // Moving the prev & current ptr so left can be pointed by curr
        for (int i = 0; i < left - 1; i++) {
            leftPrev = curr;
            curr = curr.next;
        }

        ListNode prev = null;
        // Current is pointed to left ptr and leftPrev to node before left
        for(int i = 0 ; i < right - left + 1 ; i++){
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        // Connecting the ptrs to head and end ptr
        leftPrev.next.next = curr;
        leftPrev.next = prev;

        return dummy.next;       
    }
}