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
    public ListNode swapPairs(ListNode head) {

        if(head==null || head.next==null) return head;
        
        ListNode temp = head;
        ListNode head1  = head.next;
        ListNode prev = null;

       while(temp!=null && temp.next!=null){
             ListNode temp1 = temp.next;
             ListNode nextPair = temp1.next;

             temp1.next = temp;
             temp.next = nextPair;

             if(prev!=null){
                prev.next = temp1;
             }
             prev = temp;
             temp = nextPair;
       }

       return head1;
    }
}