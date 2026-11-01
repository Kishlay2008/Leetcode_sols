class Solution {
    public int minMoves(int[] nums) {
       int min = Integer.MAX_VALUE;
       for(int ele : nums){
        min = Math.min(min,ele);
       } 
       int step = 0;
       for(int ele : nums){
        step += ele-min;
       }
       return step;
    }
}