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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null) return null;
        ListNode newHead = head;
        boolean first = true;
        ListNode cur = head;

        int num = 0;
        while(cur != null){
            num++;
            cur = cur.next;
        }
        int times = num / k;

        int iter = 0;
        ListNode now = head;
        ListNode prev;
        while(iter < times){
            iter++;
            int timer = 0;
            prev = null;
            while(timer < k){
                timer++;
                ListNode temp = now.next;
                now.next = prev;
                prev = now;
                now = temp;
            }
            ListNode beg = prev;
            if(first){
                newHead = prev;
                first = false;
            }
            while(beg.next != null){
                beg = beg.next;
            }
            ListNode jump = now;
            if(iter < times){
                int w = 1;
                while(w < k ){
                    jump = jump.next;
                    w++;
                }
                beg.next = jump;
            }
            if(iter == times){
                beg.next = now;
            }
            
        }
        return newHead;
    }
}
