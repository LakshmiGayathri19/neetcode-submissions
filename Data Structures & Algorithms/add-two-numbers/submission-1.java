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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1, temp2 = l2;
        ListNode resHead = null, resPrev = null;
        int carry = 0;
        while (temp1 != null && temp2 != null) {
            int value = temp1.val + temp2.val;
            ListNode node = new ListNode((value + carry) % 10);
            carry = value / 10;
            if (resHead == null) {
                resHead = node;
            } else {
                resPrev.next = node;
            }
            resPrev = node;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while (temp1 != null) {
            ListNode node = new ListNode((temp1.val + carry) % 10);
            carry = (temp1.val + carry)/10;
            resPrev.next = node;
            resPrev = node;
            temp1 = temp1.next;
        }
        while (temp2 != null) {
            ListNode node = new ListNode((temp2.val + carry) % 10);
            carry = (temp2.val + carry)/10;
            resPrev.next = node;
            resPrev = node;
            temp2 = temp2.next;
        }
        if (carry != 0) {
            ListNode node = new ListNode(carry);
            resPrev.next = node;
        }
        return resHead;
    }
}
