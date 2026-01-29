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
    public ListNode mergeNodes(ListNode head) {
        
        ListNode temp = head.next;
        ListNode head1 = null;
        ListNode tail1 = null;
        int data = 0;

        while(temp!=null){
             if(temp.val == 0 ){
                ListNode n1 = new ListNode(data);
                if(head1==null){
                    head1 = n1;
                    tail1 = n1;
                }else{
                    tail1.next = n1;
                    tail1 = n1;
                }
                data = 0;
             }else{
                data += temp.val;
             }
             temp = temp.next;
        }

        return head1;
    }
}