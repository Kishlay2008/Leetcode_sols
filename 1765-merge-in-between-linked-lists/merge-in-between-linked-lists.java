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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode s = list1;
        ListNode e = list1;
        for(int i = 0; i < a-1; i++){
            s = s.next;
        }
        for(int i = 0; i < b; i++){
            e = e.next;
        }
        ListNode temp = list2;
        while(temp.next != null){
            temp = temp.next;
        }
        s.next = list2;
        temp.next = e.next;
        return list1;
    }
}