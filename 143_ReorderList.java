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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        
        ListNode secondHalf = slow.next; //end of second list that we will be reversing
        ListNode prev = null;
        slow.next = null; //used to seperate the two lists
        while( secondHalf != null){
            ListNode temp = secondHalf.next;
            secondHalf.next = prev;
            prev = secondHalf;
            secondHalf = temp; //reverses the links
        }

        ListNode firstList = head;
        ListNode secondList = prev;

        while(secondList != null){
            ListNode temp1 = firstList.next;
            ListNode temp2 = secondList.next;

            firstList.next = secondList;
            secondList.next = temp1;
            firstList = temp1;
            secondList = temp2;
        }


        
        
    }
}
