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
        // Initialize two pointers pointing to the head
        ListNode fast = head;
        ListNode slow = head;
        
        // 1. Advance the fast pointer n steps ahead
        while (n > 0) {
            fast = fast.next;
            n--;
        }
        
        // Edge Case: If fast becomes null, it means n matches the list length.
        // The node to remove is the head itself, so we return head.next.
        if (fast == null) {
            return head.next;
        }
        
        // 2. Move both pointers in tandem until fast reaches the last node
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        
        // 3. Skip the nth node from the end
        slow.next = slow.next.next;
        
        return head;
    }
}
