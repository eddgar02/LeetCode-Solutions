/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if(head == null){
            return null;
        }
        HashMap<Node,Node> track = new HashMap<>();

        Node cur = head;

        while(cur != null){
            track.put(cur, new Node(cur.val));
            cur = cur.next;
            //add all the nodes to the hashmap mapping old to new nodes that were created
            // no duplicate nodes from this
            //only initializing the value and not the 
        }

        cur = head;
        while(cur != null){
            track.get(cur).next = track.get(cur.next);
            track.get(cur).random = track.get(cur.random);
            cur = cur.next;
        }
        return track.get(head);
    }
}
