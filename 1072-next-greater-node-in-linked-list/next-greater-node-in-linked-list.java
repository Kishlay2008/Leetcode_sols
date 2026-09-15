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
    public int[] nextLargerNodes(ListNode head) {
     int len = 0;
     ListNode temp = head;
     while(temp != null){
        len++;
        temp = temp.next;
     }   
     int[] arr = new int[len];

    ListNode newHead = reverse(head);
     temp = newHead;
    Stack<Integer> st = new Stack<>();
    int j = len-1;
    while(temp != null && j >= 0){
     while(!st.isEmpty() && st.peek() <= temp.val){
        st.pop();
     }
     if(st.isEmpty()){
        arr[j--] = 0;
     }
     else arr[j--] = st.peek();

     st.push(temp.val);
    temp = temp.next;
    }
    return arr;
    }
}