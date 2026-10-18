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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
      List<List<Integer>> ans = new ArrayList<>();
      ArrayList<Integer> path = new ArrayList<>();
      helper(root,path,ans,targetSum,0); 
      return ans; 
    }
    public void helper(TreeNode root, ArrayList<Integer> path, List<List<Integer>> ans,int targetSum, int sum){
        if(root == null) return;
        path.add(root.val);
        sum += root.val;
        if(root.left == null && root.right == null && sum == targetSum){
            ArrayList<Integer> list = new ArrayList<>();
            list.addAll(path);
            ans.add(list);
        }
        helper(root.left,path,ans,targetSum,sum);
        helper(root.right,path,ans,targetSum,sum);
        sum -= path.get(path.size()-1);
        path.remove(path.size()-1);
    }
}