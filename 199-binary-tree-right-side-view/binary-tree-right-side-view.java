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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list,0);
        return list;
    }
    public void helper(TreeNode root, ArrayList<Integer> list, int idx){
        if(root == null) return;
        if(idx >= list.size()) list.add(root.val);
        list.set(idx,root.val);
        helper(root.left,list,idx+1);
        helper(root.right,list,idx+1);
    }
}