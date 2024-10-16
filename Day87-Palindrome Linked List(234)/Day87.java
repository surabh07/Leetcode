/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {

        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode rev = reverse(slow.next);
        slow.next = null;

        while (rev != null) {
            if (head.val != rev.val) {
                return false;
            }
            head = head.next;
            rev = rev.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head) {

        ListNode curr = head;
        ListNode prev = null;

        while (curr != null) {
            ListNode currp1 = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currp1;
        }

        return prev;
    }
}
