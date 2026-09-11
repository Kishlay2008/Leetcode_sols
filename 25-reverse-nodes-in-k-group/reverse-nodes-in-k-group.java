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
       if(head == null) return head;
       int len = 0;
       ListNode temp = head;
       while(temp != null){
        temp = temp.next;
        len++;
       } 
       if(len<k) return head;
       ListNode curr = head;
       ListNode prev = null;
       ListNode fwd = null;
       int count = 0;
       while(curr != null && k > count){
        fwd = curr.next;
        curr.next = prev;
        prev = curr;
        curr = fwd;
        count++;
       }
       head.next = reverseKGroup(curr,k);
       return prev;
    }
}