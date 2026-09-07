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
    public ListNode reverse(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        ListNode fwd = null;
        while(curr != null){
            fwd = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fwd;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        temp = reverse(temp);
        while(temp != null){
         int val = temp.val*2+carry;
          carry = val/10;
          curr.next = new ListNode(val%10);
          curr = curr.next;
          temp = temp.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        return reverse(dummy.next);
    }
}