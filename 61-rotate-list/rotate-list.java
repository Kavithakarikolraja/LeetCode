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
    public ListNode rotateRight(ListNode head, int k) {

        if(head==null || head.next==null){
            return head;
        }

         if(k==0){
            return head;
        }

       


        ListNode temp = head;
        int length = 0;

       while(temp!=null){
           length++;
           temp = temp.next;
       }

       int k1 = k%length;

       if(k1==0) return head;

      head =  reverse(head);

      ListNode head1=head;
      ListNode head2=head;
     
    temp = head;    
    for(int i=0;i<k1-1;i++){
           temp = temp.next;
    }
    
    head2 = temp.next;
    temp.next = null;

    head1 = reverse(head1);
    head2 = reverse(head2);

    temp = head1;

    while(temp.next!=null){
        temp = temp.next;
    }
      
    temp.next = head2;

     return head1;   
    }


    private ListNode reverse(ListNode head){

        ListNode prev = null;
         ListNode next = null;
          ListNode temp  = head;

          while(temp!=null){
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
          }

          
          return prev;
    }
}