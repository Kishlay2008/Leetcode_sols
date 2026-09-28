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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        Collections.sort(list);
        for(int i = 0; i < list.size(); i++){
            curr.next = new ListNode(list.get(i));
            curr = curr.next;
        }
        curr.next = null;
        return dummy.next;
    }
}