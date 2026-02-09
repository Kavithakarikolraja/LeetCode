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
        
        ListNode header = null;
        ListNode tail = null; 

        ListNode temp1 =l1;
        ListNode prev = null;
        ListNode next = null;

        while(temp1!=null){
            next = temp1.next;
            temp1.next = prev;
            prev = temp1;
            temp1 = next;
        }

        ListNode head1 = prev;
        temp1 = head1;

        ListNode temp2 =l2;
         prev = null;
         next = null;

        while(temp2!=null){
            next = temp2.next;
            temp2.next = prev;
            prev = temp2;
            temp2 = next;
        }

        ListNode head2 = prev;
        temp2 = head2;

            int rem = 0;
        while(temp1!=null || temp2!=null){
             int val1 = (temp1 != null) ? temp1.val : 0;
            int val2 = (temp2 != null) ? temp2.val : 0;

            int sum = rem + val1 + val2;
            rem = sum / 10;

            ListNode data = new ListNode(sum % 10);



            if(header==null){
                header = data;
                tail = data;
            }else{
                tail.next = data;
                tail = data;
            }
             if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;

        }

        if (rem > 0) {
            tail.next = new ListNode(rem);
            
        }


         ListNode temper = header;
         prev = null;
         next = null;

         while(temper!=null){
            next = temper.next;
            temper.next = prev;
            prev = temper;
            temper = next;
         }

         return prev;
    }
}