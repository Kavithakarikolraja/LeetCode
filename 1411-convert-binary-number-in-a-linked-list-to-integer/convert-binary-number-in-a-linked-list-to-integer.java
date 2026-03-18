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
    public int getDecimalValue(ListNode head) {
        
        int BinaryInt = 0;

        ListNode temp = head;

        while(temp!=null){
            BinaryInt = BinaryInt *2 + temp.val;
            temp =temp.next;
        }

       /* int decimalInt = 0;

       
        for(int i=0;BinaryInt>0;i++){
            if((BinaryInt&1)==1){
                decimalInt += (1<<i) ;
            }
          BinaryInt = BinaryInt>>1;
        }*/

        return BinaryInt;
    }
}