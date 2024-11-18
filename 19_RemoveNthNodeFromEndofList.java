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
        
        ListNode cur = head;
        int total = 0;
        while(cur != null){
            total++;
            cur = cur.next;
        }
        if(total == 1 && n == 1){
            return null;
        } else if (total == n){
            return head.next;
        }
        cur = head;
        ListNode prev = null;
        int target = total - n;
        int counter = 0;
        while(cur != null){
            if(counter == target){
                prev.next = cur.next;
                break;
            }
            prev = cur;
            cur = cur.next;
            counter++;
        }
        return head;

    }
}
