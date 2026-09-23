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
    public ListNode merge(ListNode a, ListNode b){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(a != null && b != null){
            if(a.val <= b.val){
                curr.next = a;
                a = a.next;
            }
            else{
                curr.next = b;
                b = b.next;
            }
            curr = curr.next;
        }
        if(a != null){
            curr.next = a;
        }
        else{
            curr.next = b;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
        ListNode ans = lists[0];
        for(int i = 1; i < lists.length; i++){
            ans = merge(ans,lists[i]);
        }
        return ans;
    }
}