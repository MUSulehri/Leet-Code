import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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
    public ListNode sortList(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        
        ListNode curr = head;
        List<Integer> list = new ArrayList<>();
        
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        
        Collections.sort(list);
        
        ListNode newHead = new ListNode(list.get(0));
        curr = newHead;
        
        for (int i = 1; i < list.size(); i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        
        return newHead;
    }
}