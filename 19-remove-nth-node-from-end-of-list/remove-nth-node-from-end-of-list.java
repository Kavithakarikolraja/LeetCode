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
        // Step 1: Count total nodes
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        
        
        int position = length - n;
        
        
        if (position == 0) {
            return head.next;
        }
        
        
        temp = head;
        for (int i = 1; i < position; i++) {
            temp = temp.next;
        }
        
       
        temp.next = temp.next.next;
        
        return head;
    }
}