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
        
        Stack <ListNode> st = new Stack<>();
        ListNode current = head;

        while(current!=null){
            st.push(current);
            current = current.next;
        }

        int size = st.size();
        current = head;

        for(int i=0;i<size/2;i++){
            ListNode endNode = st.pop();
            ListNode nextNode = current.next;

            current.next = endNode;
            endNode.next = nextNode;
            current = nextNode;
        }

        current.next = null;
    }
}
