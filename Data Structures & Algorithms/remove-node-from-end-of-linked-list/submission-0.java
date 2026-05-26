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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode slow = head, fast = head;
        while (count <= n) {
            fast = fast.next;
            count++;
        }
        while (fast!= null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        if(fast==null) {
            return head.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
