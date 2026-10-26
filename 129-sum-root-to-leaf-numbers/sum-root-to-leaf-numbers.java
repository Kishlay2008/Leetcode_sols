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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root,sb);
        return sum;
    }
    public void helper(TreeNode root,StringBuilder path){
        if(root == null) return;
        path.append(root.val);
        if(root.left == null && root.right == null){
            sum += Integer.parseInt(path.toString());
        }
        helper(root.left,path);
        helper(root.right,path);
        path.deleteCharAt(path.length()-1);
    }
}