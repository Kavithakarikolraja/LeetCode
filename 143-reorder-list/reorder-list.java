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
    public void reorderList(ListNode head) {
        

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode temp = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode next = null;

        while(temp!=null){
                next = temp.next;
                temp.next = prev;
                prev = temp;
                temp = next;
        }
       
       temp = head;
       ListNode  temp1 = prev;
        //ListNode tail = head;

        while(temp1!=null){
           ListNode one = temp.next;
           ListNode two = temp1.next;

           temp.next = temp1;
           temp1.next = one;

           temp = one;
           temp1 = two;
        }
    }
}