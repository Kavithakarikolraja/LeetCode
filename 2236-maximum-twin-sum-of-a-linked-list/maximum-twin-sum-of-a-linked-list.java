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
    public int pairSum(ListNode head) {
        
     int sum =0;
     int size = 0;

    ListNode temp = head;
    
     while(temp!=null){
         size++;
         temp = temp.next;
     }

     temp = head;

     for(int i=0;i<size/2;i++){
        temp = temp.next;
     }

     ListNode head2 = temp;
     ListNode temp2 = head2;
     ListNode prev = null;
     ListNode next = null;

  
    while(temp2!=null){
          next = temp2.next;
          temp2.next = prev;
          prev = temp2;
          temp2 = next;

    }

    head2 = prev;
    temp = head;

    while(head2!=null){
       int a = temp.val;
       int b = head2.val;

       head2 = head2.next;
       temp = temp.next;
       sum = Math.max(sum,a+b);
           }

     
    return sum;
    }
}