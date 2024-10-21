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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur = head;

        while(cur.next != null){
            ListNode newNode = new ListNode();

            int min = cur.val;
            if(cur.val > cur.next.val){
                min = cur.next.val;
            }
            int ret = 0;

            for(int i = min; i > 0; i--){
                if(cur.val % i == 0 && cur.next.val % i == 0){
                    ret = i;
                    break;
                }
            }
            newNode.val = ret;
            newNode.next = cur.next;
            cur.next = newNode;
            cur = newNode.next;
        }
        return head;
        
    }
}
