class Solution {
    public int trap(int[] height) {
       int[] left = new int[height.length];
       int[] right = new int[height.length];
       int leftMax = 0, rightMax = 0;
       for(int i = 0; i < left.length; i++){
        leftMax = Math.max(height[i],leftMax);
        left[i] = leftMax;
       } 
        for(int i = right.length-1; i >= 0; i--){
         rightMax = Math.max(height[i],rightMax);
         right[i] = rightMax;
       } 
       int ans = 0;
       for(int i = 0; i < height.length; i++){
        ans += Math.min(left[i],right[i]) - height[i];
       }
       return ans;
    }
}