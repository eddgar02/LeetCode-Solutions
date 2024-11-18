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
        
        ListNode cur1 = l1;
        ListNode cur2 = l2;
        int carry = 0;

        ListNode newHead = new ListNode(0);
        ListNode prev = newHead;
        boolean first = false;

        while(cur1 != null || cur2 != null || carry != 0){
            int cur1Value = 0;
            int cur2Value = 0;
            if(cur1 != null){
                cur1Value = cur1.val;
            }
            if(cur2 != null){
                cur2Value = cur2.val;
            }
            if(!first){
                if(cur1Value + cur2Value >= 10){
                    newHead.val = cur1Value + cur2Value -10;
                    carry = 1;
                    
                    prev = newHead;
                } else {
                    newHead.val = cur1Value + cur2Value;
                    carry = 0;
                    
                    prev = newHead;
                }
                first = true;
            }else {
                ListNode now = new ListNode();
                if(cur1Value + cur2Value + carry >= 10){
                    now.val = cur1Value + cur2Value + carry -10;
                    carry = 1;
                } else {
                    now.val = cur1Value + cur2Value + carry;
                    carry = 0;
                }
                
                prev.next = now;
                prev = now;
            }
            if(cur1 != null){
                cur1 = cur1.next;
            }
            if(cur2 != null){
                cur2 = cur2.next;
            }

        }
        return newHead;


    }
}
