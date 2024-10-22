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
        ListNode cur = head.next;
        int currentSum = 0;
        ListNode prev = head;
        while(cur!= null){
            if(cur.val == 0){
                ListNode newNode = new ListNode(); //correct
                newNode.val = currentSum; //correct
                prev.next = newNode;
                currentSum = 0;
                cur = cur.next; //move on to next node
                prev = newNode;
            } else {
                currentSum += cur.val;
                cur = cur.next;
            }
        }
        return head.next;
    }
}
