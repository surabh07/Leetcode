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
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode temp = new ListNode(-1);
        temp.next = head;

        ListNode temp2 = temp;
        HashSet<Integer> remNum = new HashSet<>();
        for(int num : nums){
            remNum.add(num);
        }
        while(temp2.next != null){
            if(remNum.contains(temp2.next.val)){
                temp2.next = temp2.next.next;
            }
            else{
                temp2 = temp2.next;
            }
        }
        return temp.next;
    }
}
