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
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> list = new ArrayList<>();
        if(root == null) return;
        preOrder(root,list);
        for(int i = 0; i < list.size()-1; i++){
            TreeNode a = list.get(i);
            TreeNode b = list.get(i+1);
            a.right = b;
            a.left = null;
        } 
        TreeNode last = list.get(list.size()-1);
        last.left = null;
        last.right = null;
    }
    public void preOrder(TreeNode root, ArrayList<TreeNode> list){
        if(root == null) return;
        list.add(root);
        preOrder(root.left,list);
        preOrder(root.right,list);
    }
}