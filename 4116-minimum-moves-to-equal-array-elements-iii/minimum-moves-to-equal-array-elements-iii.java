class Solution {
    public int minMoves(int[] nums) {
        int max = Integer.MIN_VALUE, step = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        for(int ele : nums){
            step += max-ele;
        }
        return step;
    }
}