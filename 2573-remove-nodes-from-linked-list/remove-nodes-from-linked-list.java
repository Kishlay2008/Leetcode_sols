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
    public ListNode removeNodes(ListNode head) {
        Stack<ListNode> st = new Stack<>();
        ListNode temp = head;
        if(head == null || head.next == null) return head;
        st.push(temp);
        temp = temp.next;
        while(temp != null){
            if(st.peek().val >= temp.val){
                st.push(temp);
                temp = temp.next;
            }
            else{
                while(!st.isEmpty() && st.peek().val < temp.val){
                    st.pop();
                }
                st.push(temp);
                temp = temp.next;
            }
        }
        temp = null;
        while(!st.isEmpty()){
            ListNode curr = st.pop();
            curr.next = temp;
            temp = curr;
        }
        return temp;
    }
}