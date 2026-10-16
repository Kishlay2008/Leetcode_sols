/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root == null) return list;
        st.add(root);
        while(st.size() > 0){
            TreeNode top = st.pop();
            list.add(top.val);
            if(top.right != null) st.push(top.right);
            if(top.left != null) st.push(top.left);
        }
        return list;
    }
}