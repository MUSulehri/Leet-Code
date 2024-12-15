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
        if (head == null) return null;
        if (head.next == null && n == 1) return null;
        
        ListNode curr = head;
        ListNode prev = null;
        int count = 0;
        
        while(curr != null) {
            curr = curr.next;
            count++;
        }
        
        if (n == count) {
            return head.next;
        }
        
        curr = head;
        
        for (int i = 0; i < count-n; i++) {
            prev = curr;
            curr = curr.next;
        }
        
       if (prev != null) 
           prev.next = curr.next;
        
        return head;
    }
}